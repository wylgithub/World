package com.java.action;
import java.io.IOException;
import java.io.UnsupportedEncodingException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 添加一个版本号 
	 */
	private static final long serialVersionUID = 1L;
	
	//提供一个返回
	public String execute()
	{
		return SUCCESS;
	}
	
	//编写登陆方法
	public String login()
	{
		try
		{
			HttpServletRequest request = ServletActionContext.getRequest();//获得请求
			
			HttpServletResponse response = ServletActionContext.getResponse();//获得返回
			
			//设置请求编码
			request.setCharacterEncoding("UTF-8");
			
			response.setContentType("text/html;charset=utf-8");
			
			//获得用户名和密码
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//后台打印
			System.out.println("username-->"+username+"   password-->"+password);
			
			//判断用户名和密码正确性
			if("admin".equals(username) && "123456".equals(password))
			{
				return SUCCESS;
			}
			else
			{
				return "login";
			}
		}catch(Exception ex)
		{
			//打印异常堆栈
			ex.printStackTrace();
		}
		return SUCCESS;
	}
}
