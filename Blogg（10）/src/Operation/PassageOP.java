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
	
	public int get_newId()// ��ȡ�µĲ���id
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
			System.out.printf("��ȡ�µ�����idʧ��");
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
	
	public void get_myPassages(ArrayList<Passage> myPassages,String uid)// ��ȡĳ���������в���
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
			System.out.printf("��ȡ�����б�ʧ��");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
	}
	
	public void Add(Passage passage)//��Ӳ���
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
			System.out.printf("�������û�ʧ��" );
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
	
	public void Delete(int id)//ɾ������
	{
		CommentOP commentop=new CommentOP();//ɾ���ò���������
		commentop.DeleteByFid(id);
		conn = DBConnection.get_Connection();
		try{
			String sql = "delete from Table_P where id='"+id+"'";
			System.out.println(sql);
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("�������û�ʧ��" );
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
	
	public Passage getById(int id)//���ݲ��ı�Ż�ȡ���ľ�������
	{
		conn = DBConnection.get_Connection();
		Passage passage=new Passage ();
		try {
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select uid,title,time,article from Table_P where id='"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				String uid=rs.getString("uid");
				String article=rs.getString("article");
				String title=rs.getString("title");
				String time=rs.getString("time").substring(0,16);
				passage=new Passage(uid,title,time,article);
			}
		} catch (SQLException ex) {
			System.out.printf("��ȡ�����б�ʧ��");
			System.out.printf("%s\n", ex.toString());
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.toString());
			}
		}
		
		//�Ķ���+1
		conn = DBConnection.get_Connection();
		try{
			String sql = "update Table_P set throw=throw+1 where id='"+id+"'";
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("���������ʧ��" );
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
		return passage;
	}
}
