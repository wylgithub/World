package com.java.action;
import java.io.IOException;
import java.io.UnsupportedEncodingException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * ���һ���汾�� 
	 */
	private static final long serialVersionUID = 1L;
	
	//�ṩһ������
	public String execute()
	{
		return SUCCESS;
	}
	
	//��д��½����
	public String login()
	{
		try
		{
			HttpServletRequest request = ServletActionContext.getRequest();//�������
			
			HttpServletResponse response = ServletActionContext.getResponse();//��÷���
			
			//�����������
			request.setCharacterEncoding("UTF-8");
			
			response.setContentType("text/html;charset=utf-8");
			
			//����û���������
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//��̨��ӡ
			System.out.println("username-->"+username+"   password-->"+password);
			
			//�ж��û�����������ȷ��
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
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
		return SUCCESS;
	}
}
