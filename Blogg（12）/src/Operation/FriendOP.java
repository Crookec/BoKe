package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FriendOP {
private Connection conn=null;
	
	public FriendOP()
	{
	}
	
	public int get_newId()// ��ȡ�µĲ��ѹ�עid
	{
		int id = 0;
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select isnull(max(id),0) as newId from Table_F";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				id=rs.getInt("newId");
			}
		} catch (SQLException ex) {
			System.out.printf("��ȡ�µĲ��ѹ�עidʧ��");
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
	
	public void Add(String uid,String fid)//��ע����
	{
		int id=this.get_newId();
		conn = DBConnection.get_Connection();
		try{
			String sql = "insert into Table_F(id,uid,fid) "
					+ "values('"
					+id
					+"','"
					+uid
					+"','"
					+fid
					+"')";
			System.out.println(sql);
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("��עʧ��" );
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
	
	public void ReadById(ArrayList<String> fids,String uid)//��ȡ�����ѹ�ע����
	{
		conn = DBConnection.get_Connection();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select fid from Table_F where uid='"+uid+"'";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.printf(sql);
			while(rs.next())
			{
				String fid=rs.getString("fid");
				fids.add(fid);
			}
		} catch (SQLException ex) {
			System.out.printf("��ȡ��ע�����б�ʧ��");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void Delete(String uid,String fid)//ȡ�ز���
	{
		conn = DBConnection.get_Connection();
		try{
			String sql = "delete from Table_F where uid='"+uid+"' and fid='"+fid+"'";
			System.out.println(sql);
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("ȡ��ʧ��" );
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
