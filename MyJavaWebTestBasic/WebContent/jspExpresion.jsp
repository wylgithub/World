<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--jsp中的表达式 --%>
<!-- 显示页面被访问的当前时间 -->
当前日期为: <%= new Date()%>

<%--JSP中的声明语句 --%>
<%! int count; //声明一个int型的变量 %>
<%--声明一个变量和函数(方法) --%>
<%! String color[] = {"red","blue","green"};
	
	String getColor(int i){
		return color[i];
	}

%>
<%--声明一个变量和方法在不同的jsp声明标签中 --%>
<%! String hello = "Hello world!";
	int sum = 0;
	float bonus = 0.99f;
	%>
<%!
	int getSum(){
	return sum;
}

	//判断一个数是不是为空
	boolean isEmpty(String str){
		return (str == null || str.length() == 0)? true: false;
	}
%>

<%--Jsp的param标签的演示和说明： jsp的param变迁<jsp:param>标签通常和<jsp:forward page="装箱页面的
url" ,<jsp:include page="url">结合使用,在转向和包含页面的时候传递参数 
到达目标页面之后可以通过getParameter("参数名")的方式取出名字
--%>

<jsp:forward page="directives.jsp">
	<jsp:param value="name1" name="luoting"/>
	<jsp:param value="name2" name="wuyanlong"/>
</jsp:forward>
<%--页面的转向 --%>
<jsp:include page="index.jsp">
	<jsp:param value="name3" name="wurui"/>
	<jsp:param name="name4" value="wuxiumei"/>
</jsp:include>
<%--<jsp:include>标签表示包含一个静态的或者动态的文件 --%>
<%--
	page: 表示包含文件的路径，可以是相对路径也可以是绝对路径
	flush: 必须使flush为true，它的默认值是false
 --%>
<jsp:include page="index.jsp" flush="true"></jsp:include>
<jsp:include page="index.jsp" flush="true">
	<jsp:param value="hello jsp" name="name"/>
</jsp:include>

<%--<jsp:forward>表示重定向一个HTML/JSP文件或者程序段 --%>
<jsp:forward page="index.jsp">
	<jsp:param value="hello " name="world"/>
</jsp:forward>

<%--<jsp:useBean>标签表示在jsp页面中创建一个Bean实例，并且指定它的名字以及作用范围 --%>
<jsp:useBean id="name_id" scope="page| request| response|application|session|" typeScope ></jsp:useBean>
<%--必须说明的是：
	必须使用class或者type而不能同时使用class和beanName。beanName表示bean的名字其形式是a.b.c.d的形式
 --%>
 
 
 <%--<jsp:getProperty>标签表示获取bean的属性的值并将其转化为一个字符串,然后转化为一个输出的页面中
 	语法:<jsp:getProperty name="beanName" property="propertyName"></jsp:getProperty>
 	说明：
 	1， 再使用<jsp:getProperty>之前必须使用<jsp:useBean>来创建它，
 	2，不能使用<jsp:getProperty>来检索一个已经被索引了的属性；
 	3， 能够与javaBean一起使用<jsp:getProperty>，但是不能与EnterPrise java bean一起使用；
 	
 	
 	
 
  --%>
</body>
<jsp:getProperty name="beanName" property="propertyName"></jsp:getProperty>

<%--使用<jsp:setProperty>标签表示用来设置javaBean里面的属性值 --%>


</html>