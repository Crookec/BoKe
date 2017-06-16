<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Operation.FriendOP"%>
<%
String uid=request.getParameter("uid");
String fid=request.getParameter("fid");
FriendOP friendop=new FriendOP();
friendop.Delete(uid,fid);
%>