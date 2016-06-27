package com.java.List_Map_Set;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//���������ѧϰ����java��List��
public class TestList {

	SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
	
	
	//����һ������������һЩ����������һ��List��
	public void generateNumber(int length)
	{
		System.out.println("�������ÿ�ʼ: "+format.format((new Date())));
		//��ʼ��һ��List
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < length; i++) {
			//�����ɵ�����������numList�����У��������ɵľ�������������ˡ�
			numList.add((int)(Math.abs(Math.random())*1000));
		}
		
		//������ɵ�list
		for (int i = 0; i < length; i++) {
			System.out.println("numList["+i+"] = "+numList.get(i));
		}
		
		System.out.println("�������ý���: "+format.format(new Date()));
	}
	
	//����add(index,Element)����
	public void testAddIndex(int number)
	{
		//���һ������������α�
		int reverse_number = number;
		
		//��ʼ��һ������
		List<Integer> numList = new ArrayList<Integer>();
		
		//����һ���������
		for (int i = 0; i < number; i++) {
			numList.add(i, ((int)(Math.abs(Math.random()*10000))));
		}
		
		//����������
		int c = number;
		for (Integer integer : numList) {
			System.out.println("numList["+(c--)+"] =  "+integer);
		}
	}
}
