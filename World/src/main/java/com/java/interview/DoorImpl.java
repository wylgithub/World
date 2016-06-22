package com.java.interview;

import com.java.AbstractClass.Door;
import com.javaInterface.Alarm;

public class DoorImpl extends Door implements Alarm {

	@Override
	public void alarm() {
		System.out.println("����ž��о����Ĺ��ܣ�");

	}

	@Override
	public void open() {
		System.out.println("����ž��п��Ĺ��ܣ�");
	}

	@Override
	public void close() {
		System.out.println("����ž��йصĹ��ܣ�");
	}
	
	public void getPrint()
	{
		this.open();
		this.close();
		this.alarm();
	}

}
