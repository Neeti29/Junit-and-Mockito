package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath mymath=new MyMath();
	
	@Test
	public void sum_with3numbers()
	{
		System.out.println("Test1");
		assertEquals(6, mymath.sum(new int[] {1,2,3}));
	}
	
	
	@Test
	public void sum_with1number()
	{
		System.out.println("Test2");
		assertEquals(3,mymath.sum(new int[] {3}));
	}
	void test() {
		fail("Not yet implemented");
	}

}
