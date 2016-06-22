package com.java.AbstractClass;

import com.javaInterface.Fly;

public class Airplane implements Fly {

	@Override
	public void fly() {
		System.out.println("我是飞机，我可以飞翔！");

	}

}
