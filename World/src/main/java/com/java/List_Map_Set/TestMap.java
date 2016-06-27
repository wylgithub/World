package com.java.List_Map_Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//����java�е�Map��ʹ��
public class TestMap {

	public void testMap()
	{
		//��ʼ��һ��map����
		Map<String,Object> map1 = new HashMap<String,Object>();
		
		//ѭ����map���������
		map1.put("wuyanlong", 26);
		map1.put("luoting", 23);
		map1.put("wuxiumei", 32);
		map1.put("hello", 22);
		map1.put("hello", 23);
		
		//ʹ�÷�ʽһ�����������
		mapIteratorMethod4(map1);
	}
	
	//����map�����ַ�ʽ����ʽ1
	public void mapIteratorMethod1(Map<String,Object> map)
	{
		System.out.println("���ַ�ʽ��ͨ����Map.keySet()����key��value");
		//��ʼ�������map����
		for (String key : map.keySet()) {
			//��ӡmap����
			System.out.println("key = "+key+"   and value = "+map.get(key));
		}
	}
	
	
	//����map�����ַ�ʽ����ʽ2
	public void mapIteratorMethod2(Map<String,Object> map)
	{
		System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
		
		Iterator<Map.Entry<String, Object>>	it = map.entrySet().iterator();
		
		while (it.hasNext()) {
		   Map.Entry<String, Object> entry = it.next();
		   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		  }
	}
	

	//����map�����ַ�ʽ����ʽ3
	public void mapIteratorMethod3(Map<String,Object> map)
	{
		System.out.println("ͨ��map.entrySetʹ��iterator����key��value");
		for (Map.Entry<String, Object> entry: map.entrySet()) {
			System.out.println("key = "+entry.getKey()+"   value = "+entry.getValue());
		}
	}
	
	
	//����map�����ַ�ʽ����ʽ1
	public void mapIteratorMethod4(Map<String,Object> map)
	{
		System.out.println("�����ַ�ʽ����ʹ��Map.values()�������е�ֵ�����ǲ��ܱ���key");
		for (Object value: map.values()) {
			
			System.out.println("value "+value);
		}
	}
} 
