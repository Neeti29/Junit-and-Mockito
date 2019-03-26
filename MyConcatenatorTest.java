package com.niit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyConcatenatorTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testConcatenate()
	{
		String concatenated=MyConcatenator.concatenate("Java","Junit","Mockito","JMeter");
		assertEquals("Java,Junit,Mockito,JMeter",concatenated);
	}

}
