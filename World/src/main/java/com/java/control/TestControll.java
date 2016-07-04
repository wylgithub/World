package com.java.control;

/**
 * 这个类用于编写和Java相关的一些关键字使用代码，这些关键字主要用于控制Java的程序控制，主要 包含如下几个：
 * 
 * break
 * continue
 * return
 * do
 * while
 * if
 * else
 * for
 * instanceof
 * switch
 * case
 * default
 * @author Administrator
 *
 */
public class TestControll {

	//测试break的使用：这个关键字主要是用于终止程序的向下执行，直接跳出循环等操作
	public void testBreak1()
	{
		int i = 100;
		for (int j = 0; j < i; j++) {
			
			if(j%100 ==0)
			{
				System.out.println("在满足条件if(j%100 ==0)的时候，我已经跳出循环: 使用的关键字是Break！");
				break;
			}else{
				System.out.println("我是: "+j);
			}
		}
	}
	
	//测试continue的使用： continue主要是用于跳出满足当前条件的循环继续执行之后的循环操作
	public void testContinue1()
	{
		int length = 100;
		for (int i = 0; i < length; i++) {
			if (i%2 == 0) {
				System.out.println("我是: "+i+",是偶数，所以被跳过！");
				continue;
			}else
			{
				System.out.println("我是： "+i+"，我是基数，所以被打印！");
			}
		}
	}
	
	//测试return关键字的使用：这个关键字是用于返回一个值或者对象数组的关键字，是终止程序向下执行的关键
	public String  testReturn()
	{
		return "Hello MVC of Spring";
	}
	
	//do...while()循环操作的使用: 这个循环相对于while而言至少做一次，即使循环条件不满足也会循环一次。
	public void testDoWhile()
	{
		int i = 1000;
		
		do {
			System.out.println("我是: "+i+"但是在我小于2000的时候会继续打印！");
			i++;
		} while (i < 2000);
	}
	
	
	//if_else:用于程序分支控制的关键字
	public void testIfElse()
	{
		int i = 100;
		if(i <1000&&i>0)
		{
			i +=2;
			System.out.println("我满足条件: i<100,因此我执行了,i+=2的操作");
		}else{
			i+=4;
			System.out.println("我满足条件: i<100,因此我执行了,i+=2的操作");
		}
	}
	
	//for关键字主要是用于程序控制中的循环操作
	public void testFor()
	{
		int i = 100;
		for (int j = 0; j < i; j++) {
			System.out.println(j);
		}
	}
	
	public void testForeach()
	{
//		int i = 100;
//		for (int iterable_element : i) {
//			System.out.println();
//		}
	}
	
	
}
