package Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Info.User;

public class BloggerInfo {
	private Connection conn;
	public BloggerInfo()
	{
		
	}
	
	public void Zhuce(User user)//�û�ע��
	{
		conn = DBConnection.get_Connection();
		try{
			String sql = "insert into Table_U(id,name,nick,pwd,address,sex"
					+ ",workaddress,job,flag,birth,blogname,ok) "
					+ "values('"
					+user.get_id()
					+"','"
					+user.get_name()
					+"','"
					+user.get_nick()
					+"','"
					+user.get_pwd()
					+"','"
					+user.get_address()
					+"','"
					+user.get_sex()
					+"','"
					+user.get_workaddress()
					+"','"
					+user.get_job()
					+"','"
					+1
					+"','"
					+user.get_birth()
					+"','"
					+user.get_blogname()
					+"','"
					+1
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
	
	public boolean hadId(String id)//�û��Ƿ��Ѵ���
	{
		int count=0;
		conn = DBConnection.get_Connection();
		try{
			Statement stmt = (Statement)conn.createStatement();
			String sql ="select * from Table_U where id='"+id+"'" ;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				count ++;//��������  
			}
		}
		catch( SQLException ex ){
			System.out.printf("��ȡ�û�ʧ��" );
			System.out.printf("%s\n", ex.toString() );		
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
		if(count>0)
			return true;
		else
			return false;
	}
	
	public boolean hadNick(String nick)//�ǳ��Ƿ��ѱ�ռ��
	{
		int count=0;
		conn = DBConnection.get_Connection();
		try{
			Statement stmt = (Statement)conn.createStatement();
			String sql ="select * from Table_U where nick='"+nick+"'" ;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				count ++;//��������  
			}
		}
		catch( SQLException ex ){
			System.out.printf("��ȡ�û�ʧ��" );
			System.out.printf("%s\n", ex.toString() );		
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
		if(count>0)
			return true;
		else
			return false;
	}
	
	public User getById(String id)
	{
		User user=new User();
		conn = DBConnection.get_Connection();
		try{
			Statement stmt = (Statement)conn.createStatement();
			String sql ="select name,nick,address,sex,workaddress,job,birth,blogname from Table_U where id='"+id+"'" ;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				user.set_address(rs.getString("address"));
				user.set_birth(rs.getString("birth"));
				user.set_blogname(rs.getString("blogname"));
				user.set_job(rs.getString("job"));
				user.set_name(rs.getString("name"));
				user.set_nick(rs.getString("nick"));
				user.set_sex(rs.getString("sex"));
				user.set_workaddress(rs.getString("workaddress"));
			}
		}
		catch( SQLException ex ){
			System.out.printf("��ȡ�û�ʧ��" );
			System.out.printf("%s\n", ex.toString() );		
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
		return user;
	}
	
	public int getFlagById(String id)//�ж��ǹ���Ա������ͨ�û�
	{
		int flag=0;
		return flag;		
	}
	
	public void Change(User user)//�޸ĸ�����Ϣ���������������
	{
		conn = DBConnection.get_Connection();
		try{
			String sql = "update Table_U set name='"+user.get_name()+"',nick='"+user.get_nick()
			+"',address='"+user.get_address()+"',sex='"+user.get_sex()+"',workaddress='"
					+user.get_workaddress()+"',job='"+user.get_job()
					+"',birth='"+user.get_birth()+"',blogname='"+user.get_blogname()
			+"'where id='"+user.get_id()+"'" ;
			System.out.printf(sql );	
			Statement st = ( Statement ) conn.createStatement();
			st.executeUpdate(sql);	
		}
		catch( SQLException ex ){
			System.out.printf("%s\n", ex.toString() );
			System.out.printf("���¸�����Ϣʧ��" );
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
	
	public String get_Nick(String id)//�����û�id��ȡ�ǳ�
	{
		String nick = null;
		conn = DBConnection.get_Connection();
		try{
			Statement stmt = (Statement)conn.createStatement();
			String sql ="select nick from Table_U where id='"+id+"'" ;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				nick=rs.getString("nick");
			}
		}
		catch( SQLException ex ){
			System.out.printf("��ȡ�û�ʧ��" );
			System.out.printf("%s\n", ex.toString() );		
		}
		finally{
			try{
				conn.close();
			}
			catch( SQLException ex ){
				System.out.println( ex.toString()  );
			}
		}
		return nick;
	}
	
	public void get_Like(String name,ArrayList<String> users)//�����û�id��ȡ�ǳ�
	{
		conn = DBConnection.get_Connection();
		try{
			Statement stmt = (Statement)conn.createStatement();
			String sql ="select id from Table_U where nick '%"+name+"%'"  ;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String uid=rs.getString("id");
				users.add(uid);
			}
		}
		catch( SQLException ex ){
			System.out.printf("��ȡ�û�ʧ��" );
			System.out.printf("%s\n", ex.toString() );		
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
