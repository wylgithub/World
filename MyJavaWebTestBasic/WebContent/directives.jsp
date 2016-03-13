<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%--使用taglib引用JsTL ，--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 在这里可以通过c:set标签将hello赋值给name -->
<c:set var="name" value="hello"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/html">
	.datestyle{
		color:red;
	}
</style>
<title>JSp指令的集合</title>
</head>
<body>
<%--描述 --%>

<h1 class="datestyle">显示当前的时间: </h1>
<%
	//显示当前的时间
	//The type Date is ambiguous： 是因为导入了两个有date的类，sql和util，因此不知道使用那一个里面的Date导致的，
	//所以要么明确指定一个，要么删除其中之一
	Date date = new Date();
	//获取时间格式话
	//很郁闷，为什么SimpleDateFormat类不可以通过“java.text.*”
	//导入呢？为啥需要直接使用"java.text.SimpleDateFormat"指定导入
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	String dateformat = sdf.format(date);
	out.print("获取当前时间并且格式化之后:  "+dateformat);

%>

<h1>开始使用include指令包含一个文件进来，包含的文件是： inluceDirectives.jsp</h1>
<%@ include file="includeDirectives.jsp" %>
 
<%=out.println("取出页面jspExpresion.jsp中通过<jsp:forward>标签传递过来的参数: "+request.getParameter("luoting")) %>
</body>
</html>