package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Info.Message;

public class MessageOP {
	
private Connection conn;
	
	public MessageOP()
	{
		
	}
	
	public int get_newId() {
		int id = 0;
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select isnull(max(id),0) as newId from Table_M";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				id = rs.getInt("newId");
			}
		} catch (SQLException ex) {
			System.out.printf("ªÒ»°–¬µƒ¡Ù—‘id ß∞‹");
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
	
	public void AddBox(Message message)//∑¢±Ì¡Ù—‘œ‰¡Ù—‘
	{
		conn = DBConnection.get_Connection();
		try {
			String sql = "insert into Table_M(id,send,receive,message,time) " + "values('" + message.get_id() + "','"
					+ message.get_send() + "','" + message.get_receive()+ "','" + message.get_message()+ "','"
					+ message.get_time() + "')";
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("∑¢±Ì¡Ù—‘ ß∞‹");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void ReadBoxByUid(ArrayList<Message> messages,String uid)//∏˘æ›”√ªß∫≈∂¡»°¡Ù—‘∞Â¡Ù—‘
	{
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select id,send,message,time from Table_M where receive='"+uid+"' order by time desc";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.printf(sql);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String send=rs.getString("send");
				String time=rs.getString("time").substring(0,16);
				String words=rs.getString("message");
				Message message=new Message(id,send,words,time);
				messages.add(message);
			}
		} catch (SQLException ex) {
			System.out.printf("ªÒ»°¡Ù—‘¡–±Ì ß∞‹");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void DeleteBox(int id)//…æ≥˝¡Ù—‘œ‰¡Ù—‘
	{
		AnserOP anserop=new AnserOP();
		anserop.DeleteB(id);
		
		conn = DBConnection.get_Connection();
		try {
			String sql = "delete from Table_M where id ='"+id+"'";
			System.out.println(sql);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.printf("%s\n", ex.toString());
			System.out.printf("…æ≥˝¡Ù—‘ ß∞‹");
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}

}
