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
			System.out.println("加载驱动成功！");
			}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("加载驱动失败！");
			}
		try{
			conn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("连接数据库成功！");
			}
		catch(Exception e){
			e.printStackTrace();	
			System.out.print("SQL Server连接失败！");
			}
		return conn;
		}
	}
