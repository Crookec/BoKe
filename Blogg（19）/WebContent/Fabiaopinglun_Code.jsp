<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="Operation.CommentOP"%>
<%@page import="Info.Comment"%>
    <%
    int pid=Integer.parseInt(request.getParameter("pid"));
    String uid=request.getParameter("uid");
	String words=request.getParameter("words");//评论内容
    CommentOP commentop=new CommentOP();
	Comment comment=new Comment(pid,uid,words);
	commentop.Add(comment);
    %>