package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Info.Passage;

public class PassageOP {
	private Connection conn;
	
	public PassageOP()
	{
	}
	
	public int get_newId()// 获取新的博文id
	{
		int id = 0;
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select isnull(max(id),0) as newId from Table_P";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				id=rs.getInt("newId");
			}
		} catch (SQLException ex) {
			System.out.printf("获取新的文章id失败");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
		return id+1;
	}
	
	public void get_myPassages(ArrayList<Passage> myPassages,String uid)// 获取某博主的所有博文
	{
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select id,title,time from Table_P where uid='"+uid+"' order by time desc";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String title=rs.getString("title");
				String time=rs.getString("time").substring(0,10);
				Passage passage=new Passage(id,title,time);
				myPassages.add(passage);
			}
		} catch (SQLException ex) {
			System.out.printf("获取博文列表失败");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void Add(Passage passage)//添加博文
	{
		conn = DBConnection.get_Connection();
		try{
			String sql = "insert into Table_P(id,title,article,uid,time,throw) "
					+ "values('"
					+passage.get_id()
					+"','"
					+passage.get_title()
					+"','"
					+passage.get_article()
					+"','"
					+passage.get_uid()
					+"','"
					+passage.get_time()
					+"','"
					+passage.get_throw()
					+"')";
			System.out.println(sql);
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("创建新用户失败" );
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
	}
	
	public void Delete(int id)//删除博文
	{
		conn = DBConnection.get_Connection();
		try{
			String sql = "delete from Table_P where id='"+id+"'";
			System.out.println(sql);
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("创建新用户失败" );
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
	}
}
