package com.niit.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Spy;

public class MockitoSpyMethodExample {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Spy
	List<String> spyOnList;
	@Test
	public void test()
	{
	
		List<String> list=new ArrayList<>();
		spyOnList=spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10,spyOnList.size());
		
		//calling real methods since below methods are not stubbed
		
		spyOnList.add("Neeti");
		spyOnList.add("Nikita");
		assertEquals("Neeti" ,spyOnList.get(0));
		assertEquals("Nikita" ,spyOnList.get(1));
		System.out.println(spyOnList.get(0));
		System.out.println(spyOnList.get(1));
	}

}
