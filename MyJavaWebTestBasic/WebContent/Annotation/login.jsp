<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!-- 导入struts2的标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp登录页面</title>
</head>
<body>
<h1>登录页面展示</h1>
	<s:form name="form1" action="login" method="post">
		<s:textfield name="username" label="用户名:"></s:textfield>
		<s:textfield name="password" label="密码:"></s:textfield>
		<s:submit value="登录"></s:submit>
	</s:form>
</body>
</html>