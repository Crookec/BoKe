<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="Operation.CommentOP"%>
<%
int sid=Integer.parseInt(request.getParameter("sid"));;//当前选中的博文评论id(与留言板同)
CommentOP commentop=new CommentOP();
commentop.DeleteById(sid);
%>