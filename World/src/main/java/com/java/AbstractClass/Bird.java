package com.java.AbstractClass;

import com.javaInterface.Fly;

public class Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("我是鸟儿，我也可以飞翔！");
	}

}
