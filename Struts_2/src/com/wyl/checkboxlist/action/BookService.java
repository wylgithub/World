package com.wyl.checkboxlist.action;

public class BookService {

	public Book[] getBooks(){
		return new Book[]{
				new Book("Java编程思想","WYL"),
				new Book("C++","wangxiaojun"),
				new Book("C语言","刘德华")
		};
	}
}
