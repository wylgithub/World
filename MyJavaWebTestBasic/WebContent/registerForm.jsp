<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="tt.MyBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--设置javaBean --%>
<jsp:useBean id="user" class="tt.MyBean"></jsp:useBean><br>
<jsp:setProperty property="mUserName" name="user" param="mUserName"/><br>
<jsp:setProperty property="password" name="user" param="password"/><br>
<jsp:setProperty property="passwordAgain" name="user" param="passwordAgain"/><br>
<jsp:setProperty property="phoneNumber" name="user" param="phoneNumber"/><br>
<jsp:setProperty property="sex" name="user" param="sex"/><br>

<hr>
用户名:<jsp:getProperty property="mUserName" name="user"/><br>
密码:<jsp:getProperty property="password" name="user"/><br>
再次密码:<jsp:getProperty property="passwordAgain" name="user"/><br>
手机号码:<jsp:getProperty property="phoneNumber" name="user"/><br>
性别:<jsp:getProperty property="sex" name="user"/><br>
</body>
</html>