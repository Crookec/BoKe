package Operation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection get_Connection(){
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Blog"; 
		String userName="sa";
		String userPwd="123456"; 
		Connection conn=null;
		try{
			Class.forName(driverName);
			System.out.println("���������ɹ���");
			}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
			}
		try{
			conn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("�������ݿ�ɹ���");
			}
		catch(Exception e){
			e.printStackTrace();	
			System.out.print("SQL Server����ʧ�ܣ�");
			}
		return conn;
		}
	}
