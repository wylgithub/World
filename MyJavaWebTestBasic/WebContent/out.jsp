<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--jsp九大内置对象之-----out --%>
	输出缓冲区的大小<%=out.getBufferSize() %>
	获取缓冲区的当前大小:<%=out.getRemaining() %>
</body>
</html>