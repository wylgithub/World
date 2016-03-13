<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>登录页面展示</h1>
<form action="login1.jsp">
	用户名: <input type="text" name="name" /> <br>
	密    码: <input type="password" name="password" /><br> 
	<input type="submit" value="提交" />
	<div id="error">
		<font color="red">
			<%
				String message = (String)request.getAttribute("error");
				if(null != message)
					out.println(message);
			%>
		</font>
	</div>
</form>
</body>
</html>