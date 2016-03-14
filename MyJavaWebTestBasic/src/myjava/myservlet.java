package myjava;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet implements Servlet {

	//无参数构造函数
	public myservlet(){
		super();
	}
	@Override
	public void destroy() {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {

	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException
	,IOException{
		//获取前端的用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		MyJavaBean myDb = new MyJavaBean();
		String message = myDb.login(username, password);
		String url = "returnMessages.jsp?tt="+message;
		url = new String(url.getBytes("GBK"),"ISO-8859-1");
		response.sendRedirect(url);//请求转发
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException
	,IOException{
		this.doGet(request, response);
}
}
