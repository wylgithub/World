<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户登录</h1>
	<form action="registerForm.jsp" method="get">
		<div>
			用  户  名: <input type="text" name="mUserName" size="20"><br>
		</div>
		<div>
			密        码: <input type="password" name="password" size="20"><br>
		</div>
		<div>
			确定密码:<input type="password" name="passwordAgain" size="20"><br>
		</div>
		<div>
			手机号码:<input type="text" name="phoneNumber" size="20"><br>
		</div>
		<div>
			性       别:<input type="radio" name="sex" checked="checked">男
				  
		</div>
		<div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" checked="checked">女 <br> 
		</div>
		<div>
			<input type="submit" value="注册" style="background-color: green;width:50px;height:40px;padding-top: 100px;">
		</div>
	</form>
</body>
</html>