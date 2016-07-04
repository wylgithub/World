package com.java.list.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.java.list_.LitpOperation;

//娴嬭瘯java涓璴ist鎿嶄綔鐨勬柟娉�
public class ListOperationTest {

	@Test
	public void testSize()
	{
		LitpOperation oper = new LitpOperation();
		
		//瀹炰緥鍖栦竴涓狪nteger,String锛孌ouble鏁扮粍
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		list1.add("word");
		list1.add("wyl");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(456);
		list2.add(789);
		list2.add(963);
		
		List<Double> list3 = new ArrayList<Double>();
		list3.add(12.32);
		list3.add(123.6);
		list3.add(985.235);
		
		//鑾峰緱瀵瑰簲鏁扮粍闀垮害
		long size1 = oper.getSize(list1);
		
		long size2 = oper.getSize(list2);
		
		long size3 = oper.getSize(list3);
		
		//鎵撳嵃闀垮害淇℃伅
		System.out.println("List1 = "+size1+"\nList2 = "+size2+"\nlist3 = "+size3);
	}
	
	
	@Test
	public void testListIsEmpty()
	{
		LitpOperation oper = new LitpOperation();
		
		//瀹炰緥鍖栦竴涓狪nteger,String锛孌ouble鏁扮粍
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		list1.add("word");
		list1.add("wyl");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(456);
		list2.add(789);
		list2.add(963);
		
		List<Double> list3 = new ArrayList<Double>();
		list3.add(12.32);
		list3.add(123.6);
		list3.add(985.235);
		
		//娣诲姞涓�涓┖鏁扮粍娴嬭瘯
		List<String> list4 = new ArrayList<String>();
		
		boolean b1 = oper.isEmpty(list1); //杩斿洖false
		
		boolean b2 = oper.isEmpty(list2); //杩斿洖false
		
		boolean b3 = oper.isEmpty(list3); //杩斿洖false
		
		boolean b4 = oper.isEmpty(list4); //杩斿洖true
		
		//楠岃瘉缁撴灉
		System.out.println("b1 = "+b1+"\nb2 = "+b2+"\nb3 = "+b3+"\nb4 = "+b4);
		
		/**
		 * 鎵ц缁撴灉濡備笅锛�
		 * 
		 * b1 = false
			b2 = false
			b3 = false
			b4 = true
			涓庨鏈熺寽娴嬬粨鏋滅浉鍚�
		 */
	}
	
}
