package com.niit.mockito;

import static org.junit.Assert.*;

import static com.niit.mockito.Demo.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class MockitoHelloWorld {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void demoGreets()
	{
		Demo d=mock(Demo.class); //Create mock demo object
		when(d.greet()).thenReturn("HELLO_WORLD"); //Adding Behaviour
		System.out.println("Demo greets: " +d.greet()); 
		assertEquals(d.greet() , "HELLO_WORLD"); //Verfifying it
		
	}

}
