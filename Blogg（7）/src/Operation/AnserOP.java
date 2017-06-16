package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Info.Anser;

public class AnserOP {
	private Connection conn;
	public AnserOP()
	{
		
	}
	
	public int get_newId() {
		int id = 0;
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select isnull(max(id),0) as newId from Table_A";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				id = rs.getInt("newId");
			}
		} catch (SQLException ex) {
			System.out.printf("获取新的文章评论id失败");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
		return id + 1;
	}
	
	public void Add(Anser anser)// 回复评论
	{
		conn = DBConnection.get_Connection();
		try {
			String sql = "insert into Table_A(aid,id,flag,sid,anser,time) " + "values('" +  anser.get_aid() + "','"+anser.get_id() + "','"
					+ anser.get_flag() + "','" + anser.get_sid() + "','" + anser.get_anser() + "','"
					+ anser.get_time() + "')";
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("回复评论失败");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void get_cAnser(ArrayList<Anser> ansers,int sid)//读取博文评论回复
	{
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select id,aid,time,anser from Table_A where sid="+sid+" and flag=1 order by time desc";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.printf(sql);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String aid=rs.getString("aid");
				String time=rs.getString("time").substring(0,16);;
				String anser=rs.getString("anser");
				Anser anse=new Anser(id,aid,time,anser);
				ansers.add(anse);
			}
		} catch (SQLException ex) {
			System.out.printf("获取博文评论回复列表失败");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
}
