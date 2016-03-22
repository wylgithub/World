<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:form>
		<!-- 展示struts-tags标签的 -->
	<h3>使用s:checkboxlist标签生成多个复选框</h3>
	<s:checkboxlist name="bn" label="请选择你喜欢的图书" labelposition="top" list="{'Java程序设计','JSP程序设计','J2EE企业级开发'}"></s:checkboxlist>
	<s:checkboxlist label="请选择年份" name="bd" list="#{'java':'3013年8月','JSP':'2013年12月','J2EE':'2039年13月' }" listKey="key" listValue="value"></s:checkboxlist>
	<s:bean name="com.wyl.checkboxlist.action.BookService" id="bs" />
	<s:checkboxlist name="bookBean" label="请选择您喜欢的图书" labelposition="top"  list="#bs.books"
	listKey="name" listValue="name"
	></s:checkboxlist>
	</s:form>
</body>
</html>