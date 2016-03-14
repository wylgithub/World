package myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJavaBean {

	//创建数据库连接对象
	Connection conn;
	
	Statement stmt;
	
	public MyJavaBean(){
		try{
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接数据库
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_user", "root", "woaiwojia..123");
			stmt = conn.createStatement();
		}catch(Exception ex){
			//打印异常堆栈
			ex.printStackTrace();
		}
	}
	
	public String login(String name,String password){
		String message = "abc";
		try{
			//查询数据库
			String sql1 = "select count(*) from user_info where user_name='"+name+"'";
			ResultSet rs1 = stmt.executeQuery(sql1);
			if(rs1.next()){
				int userCount = rs1.getInt(1);
				if(0 == userCount){
					message = "不存在该用户！";
					return message;
				}
				
				String sql2 = "select count(*) from user_info where user_name = '"+name+"'and password'"+password+'"';
				ResultSet rs2 = stmt.executeQuery(sql2);
				if(rs2.next()){
					int trueUserCount = rs2.getInt(1);
					if(0 == trueUserCount){
						message = "密码错误";
						return message;
					}
					message = "成功！";
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return message;
	}
}
