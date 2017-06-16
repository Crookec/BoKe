<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="Operation.AnserOP"%>
<%@page import="Info.Anser"%>
<%
int sid=Integer.parseInt(request.getParameter("sid"));
String uid=request.getParameter("uid");
String words=request.getParameter("words");//评论内容
Anser anser=new Anser(uid,sid,1,words);
AnserOP anserop=new AnserOP();
anserop.Add(anser);
%>