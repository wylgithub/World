package com.java.testList;

import org.junit.Test;

import com.java.List_Map_Set.TestList;
import com.java.List_Map_Set.TestMap;

public class testList {

	@Test
	public void getList()
	{
		TestList tl = new TestList();
		
		tl.generateNumber(10);
	}
	
	@Test
	public void testAdd()
	{
		TestList t2 = new TestList();
		
		t2.testAddIndex(10);
	}
	
	@Test
	public void testMap()
	{
		TestMap t3 = new TestMap();
		
		t3.testMap();
	}
}
