package com.java.control;

/**
 * ��������ڱ�д��Java��ص�һЩ�ؼ���ʹ�ô��룬��Щ�ؼ�����Ҫ���ڿ���Java�ĳ�����ƣ���Ҫ �������¼�����
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

	//����break��ʹ�ã�����ؼ�����Ҫ��������ֹ���������ִ�У�ֱ������ѭ���Ȳ���
	public void testBreak1()
	{
		int i = 100;
		for (int j = 0; j < i; j++) {
			
			if(j%100 ==0)
			{
				System.out.println("����������if(j%100 ==0)��ʱ�����Ѿ�����ѭ��: ʹ�õĹؼ�����Break��");
				break;
			}else{
				System.out.println("����: "+j);
			}
		}
	}
	
	//����continue��ʹ�ã� continue��Ҫ�������������㵱ǰ������ѭ������ִ��֮���ѭ������
	public void testContinue1()
	{
		int length = 100;
		for (int i = 0; i < length; i++) {
			if (i%2 == 0) {
				System.out.println("����: "+i+",��ż�������Ա�������");
				continue;
			}else
			{
				System.out.println("���ǣ� "+i+"�����ǻ��������Ա���ӡ��");
			}
		}
	}
	
	//����return�ؼ��ֵ�ʹ�ã�����ؼ��������ڷ���һ��ֵ���߶�������Ĺؼ��֣�����ֹ��������ִ�еĹؼ�
	public String  testReturn()
	{
		return "Hello MVC of Spring";
	}
	
	//do...while()ѭ��������ʹ��: ���ѭ�������while����������һ�Σ���ʹѭ������������Ҳ��ѭ��һ�Ρ�
	public void testDoWhile()
	{
		int i = 1000;
		
		do {
			System.out.println("����: "+i+"��������С��2000��ʱ��������ӡ��");
			i++;
		} while (i < 2000);
	}
	
	
	//if_else:���ڳ����֧���ƵĹؼ���
	public void testIfElse()
	{
		int i = 100;
		if(i <1000&&i>0)
		{
			i +=2;
			System.out.println("����������: i<100,�����ִ����,i+=2�Ĳ���");
		}else{
			i+=4;
			System.out.println("����������: i<100,�����ִ����,i+=2�Ĳ���");
		}
	}
	
	//for�ؼ�����Ҫ�����ڳ�������е�ѭ������
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
