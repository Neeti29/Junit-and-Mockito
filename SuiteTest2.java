package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SuiteTest2 {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void createAndSetName()
	{
		String actual="Y";
		String expected="Y";
		
		Assert.assertEquals(expected, actual);
		System.out.println("Suite Test 2 is successful " + actual);
	}

}
