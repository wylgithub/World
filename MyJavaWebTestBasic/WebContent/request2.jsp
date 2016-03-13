<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--演示request内置对象的传值方式 --%>
<h1>request示例</h1>
<%
	request.setAttribute("A1", "我是页面request1.jsp定义的变量");
%>
<%--将页面跳转到request2.jsp --%>
<jsp:forward page="request1.jsp"></jsp:forward>
</body>
</html>