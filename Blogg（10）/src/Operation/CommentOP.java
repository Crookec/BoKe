package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Info.Comment;

public class CommentOP {
	private Connection conn;
	public CommentOP() {

	}
	
	public int get_newId() {
		int id = 0;
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select isnull(max(id),0) as newId from Table_C";
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
	
	public void Add(Comment comment)// 发表评论
	{
		conn = DBConnection.get_Connection();
		try {
			String sql = "insert into Table_C(id,pid,words,time,send) " + "values('" + comment.get_id() + "','"
					+ comment.get_pid() + "','" + comment.get_words() + "','" + comment.get_time() + "','"
					+ comment.get_send() + "')";
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("发表评论失败");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void get_Comments(ArrayList<Comment> comments,int pid)//获取评论
	{
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select id,send,time,words from Table_C where pid='"+pid+"' order by time desc";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.printf(sql);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String send=rs.getString("send");
				String time=rs.getString("time").substring(0,16);
				String words=rs.getString("words");
				Comment comment=new Comment(id,send,time,words);
				comments.add(comment);
			}
		} catch (SQLException ex) {
			System.out.printf("获取博文评论列表失败");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void DeleteById(int id)
	{
		AnserOP anserop=new AnserOP();
		anserop.DeleteBySid(id);
		
		conn = DBConnection.get_Connection();
		try {
			String sql = "delete from Table_C where id="+id;
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("删除评论失败");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void DeleteByFid(int pid)
	{
		AnserOP anserop=new AnserOP();
		anserop.DeleteByPid(pid);
		
		conn = DBConnection.get_Connection();
		try {
			String sql = "delete from Table_C where pid="+pid;
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("删除评论失败");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}	
	}
}
