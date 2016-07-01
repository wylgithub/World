package com.java.dao.userLoginImpl;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.java.dao.userLogin.UserLogin;

public class UserLoginImpl implements UserLogin {

	@Override
	public boolean login(String username, String password) {
		//获取用户名
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if("admin".equals(username) || "123456".equals(password)){
			return true;
		}else{
			return false;
		}
	}
}
