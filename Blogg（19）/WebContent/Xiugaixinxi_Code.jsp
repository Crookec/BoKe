<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="Info.User" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="Operation.BloggerInfo" %>
<%
String _id=request.getParameter("uid");
String _name=request.getParameter("name");
String _nick=request.getParameter("nick");
String _address=request.getParameter("address");
String _sex=request.getParameter("sex");
String _workaddress=request.getParameter("workaddress");
String _job=request.getParameter("job");
String _birth=request.getParameter("birth");
String _blogname=request.getParameter("blogname");
String jieguo="";
System.out.println(_id+_name+_nick+_address+_sex+_workaddress+_job+_birth);
BloggerInfo bloggerinfo=new BloggerInfo();
User user=new User(_id,_name,_nick,_address,_sex,_workaddress,_job,_birth,_blogname);
try  
{  
	Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
    date = sdf.parse(_birth);  
}  
catch (ParseException e)  
{  
	jieguo="日期错误";
    System.out.println(e.getMessage());  
}
if(!_sex.equals("男")&&!_sex.equals("女"))
{
	jieguo="请在性别一栏填男或女";
}
else if(bloggerinfo.hadNick(_nick))
{
	jieguo="该昵称已有人占用!";
}
else if(jieguo.equals("日期错误"))
{
	jieguo="请按××××-××-××格式输入生日";
}
else
{
	jieguo="个人信息修改成功";
	bloggerinfo.Change(user);
}
System.out.println(jieguo);
response.setContentType("text/xml; charset=UTF-8");  
response.setHeader("Cache-Control","no-cache"); 
out.println("<result>");
out.println( "<repeat>"+jieguo+"</repeat>" );
out.println("</result>");
%>