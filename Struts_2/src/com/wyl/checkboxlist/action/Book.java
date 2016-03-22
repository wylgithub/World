package com.wyl.checkboxlist.action;

public class Book {

	private String name; //书名
	private String author;//书的作者
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//无参数构造函数
	public Book(){}
	
	//有参数的构造函数
	public Book(String name,String author){
		this.name = name;
		this.author = author;
	}
	
}
