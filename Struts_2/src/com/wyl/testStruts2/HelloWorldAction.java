package com.wyl.testStruts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		System.out.println("Ö´ÐÐAction¿ªÊ¼£¡");
		return SUCCESS;
	}

	
}
