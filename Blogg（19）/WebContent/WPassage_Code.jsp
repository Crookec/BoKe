<%@page import="Operation.PassageOP"%>
<%@page import="Info.Passage" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String _uid=request.getParameter("uid");//当前登录的账号id
String _title=request.getParameter("title");
String _article=request.getParameter("article");
Passage passage=new Passage(_title,_article,_uid);
PassageOP passageop=new PassageOP();
passageop.Add(passage);
%>