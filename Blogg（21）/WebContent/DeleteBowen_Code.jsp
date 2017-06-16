<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="Operation.PassageOP"%>
<%
int id=Integer.parseInt(request.getParameter("pid"));
PassageOP passageop=new PassageOP();//删除该博文
passageop.Delete(id);
%>