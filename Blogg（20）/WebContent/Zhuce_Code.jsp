<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="Info.User"%>
<%@page import="Operation.BloggerInfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    String _id=request.getParameter("id");
	String _nick=request.getParameter("nick");
	String _pwd=request.getParameter("pwd");
	String _rpwd=request.getParameter("rpwd");
	String _blogname=_nick+"的博客";//默认博客名字
	String jieguo="";
	System.out.println(_id+_nick+_pwd+_rpwd);
	User user=new User(_id,_nick,_pwd,_blogname);
	BloggerInfo bloggerinfo=new BloggerInfo();
	//判断用户是否已存在
	if(bloggerinfo.hadId(_id))
	{
		jieguo="该账号已有人使用！";
	}
	else if(bloggerinfo.hadNick(_nick))
	{
		jieguo="该昵称已有人使用！";
	}
	else
	{
		//正则判断手机号是否符合要求、判断密码、昵称是否为空
		String regExp = "1[3578]\\d{9}";  
		  
		Pattern p = Pattern.compile(regExp);  
		  
		Matcher m = p.matcher(_id); 
		System.out.println(_id);
		if(m.matches()&&!_nick.equals(null)&&!_pwd.equals(null)&&_pwd.length()==6&&_pwd.equals(_rpwd))
		{
			bloggerinfo.Zhuce(user);
			jieguo="注册成功！";
		}
		else
		{
			if(!m.matches())
			{
				jieguo="请输入符合要求的手机号！";
				
			}
			else if(_nick.equals(null))
			{
				jieguo="昵称不能为空!";
			}
			else if(_pwd.length()!=6)
			{
				jieguo="请输入六位的密码";
			}
			else
			{
				jieguo="两次输入的密码不同";
			}
		}
	}
	System.out.println(jieguo);
	response.setContentType("text/xml; charset=UTF-8");  
	response.setHeader("Cache-Control","no-cache"); 
	out.println("<result>");
	out.println( "<repeat>"+jieguo+"</repeat>" );
	out.println("</result>");
    %>