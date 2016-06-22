package com.java.interview;

import com.java.AbstractClass.Door;
import com.javaInterface.Alarm;

public class DoorImpl extends Door implements Alarm {

	@Override
	public void alarm() {
		System.out.println("这个门具有警报的功能！");

	}

	@Override
	public void open() {
		System.out.println("这个门具有开的功能！");
	}

	@Override
	public void close() {
		System.out.println("这个门具有关的功能！");
	}
	
	public void getPrint()
	{
		this.open();
		this.close();
		this.alarm();
	}

}
