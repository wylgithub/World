package com.java.List_Map_Set;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//这个类用于学习测试java的List类
public class TestList {

	SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
	
	
	//常见一个方法，生成一些随机数存放于一个List中
	public void generateNumber(int length)
	{
		System.out.println("方法调用开始: "+format.format((new Date())));
		//初始化一个List
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < length; i++) {
			//将生成的随机数存放于numList集合中，这样生成的就是随机的整数了。
			numList.add((int)(Math.abs(Math.random())*1000));
		}
		
		//输出生成的list
		for (int i = 0; i < length; i++) {
			System.out.println("numList["+i+"] = "+numList.get(i));
		}
		
		System.out.println("方法调用结束: "+format.format(new Date()));
	}
	
	//测试add(index,Element)方法
	public void testAddIndex(int number)
	{
		//获得一个反向输出的游标
		int reverse_number = number;
		
		//初始化一个数组
		List<Integer> numList = new ArrayList<Integer>();
		
		//生成一个随机数组
		for (int i = 0; i < number; i++) {
			numList.add(i, ((int)(Math.abs(Math.random()*10000))));
		}
		
		//输出这个序列
		int c = number;
		for (Integer integer : numList) {
			System.out.println("numList["+(c--)+"] =  "+integer);
		}
	}
}
