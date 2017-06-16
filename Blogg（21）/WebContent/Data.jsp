<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
int pid=Integer.parseInt(request.getParameter("pid"));
%>

<script type="text/javascript">
window.location.href="MyBlog.jsp?pid="+<%=pid%>+"&req='bowenxiangqing'";
</script>
