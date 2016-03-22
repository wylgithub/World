<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!-- 导入struts2的标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success.jsp登录成功页面</title>
</head>
<body>
<h1>登录页面展示</h1>
	<div>
		<s:property name="username"/>,登录成功！
	</div>
</body>
</html>