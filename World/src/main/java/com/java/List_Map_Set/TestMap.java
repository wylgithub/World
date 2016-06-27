package com.java.List_Map_Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//测试java中的Map的使用
public class TestMap {

	public void testMap()
	{
		//初始化一个map对象
		Map<String,Object> map1 = new HashMap<String,Object>();
		
		//循环向map中添加内容
		map1.put("wuyanlong", 26);
		map1.put("luoting", 23);
		map1.put("wuxiumei", 32);
		map1.put("hello", 22);
		map1.put("hello", 23);
		
		//使用方式一迭代输出内容
		mapIteratorMethod4(map1);
	}
	
	//遍历map的四种方式：方式1
	public void mapIteratorMethod1(Map<String,Object> map)
	{
		System.out.println("这种方式是通过，Map.keySet()遍历key和value");
		//开始遍历输出map内容
		for (String key : map.keySet()) {
			//打印map类容
			System.out.println("key = "+key+"   and value = "+map.get(key));
		}
	}
	
	
	//遍历map的四种方式：方式2
	public void mapIteratorMethod2(Map<String,Object> map)
	{
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		
		Iterator<Map.Entry<String, Object>>	it = map.entrySet().iterator();
		
		while (it.hasNext()) {
		   Map.Entry<String, Object> entry = it.next();
		   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		  }
	}
	

	//遍历map的四种方式：方式3
	public void mapIteratorMethod3(Map<String,Object> map)
	{
		System.out.println("通过map.entrySet使用iterator遍历key和value");
		for (Map.Entry<String, Object> entry: map.entrySet()) {
			System.out.println("key = "+entry.getKey()+"   value = "+entry.getValue());
		}
	}
	
	
	//遍历map的四种方式：方式1
	public void mapIteratorMethod4(Map<String,Object> map)
	{
		System.out.println("第四种方式就是使用Map.values()遍历所有的值，但是不能遍历key");
		for (Object value: map.values()) {
			
			System.out.println("value "+value);
		}
	}
} 
