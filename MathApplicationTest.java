//Working with Annotations
package com.niit.mockito;

import junit.framework.Assert;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;



@RunWith(MockitoJUnitRunner.class)

public class MathApplicationTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	//@InjectMocks annotation is used to create and inject the mock object
	
	@InjectMocks  //Injecting the values at runtime from one service to another
	MathApplication mathApplication=new MathApplication();
	
	//@Mock annotation is used to create the mock object to be injected
	
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAdd()
	{
		//add the behavior of calc service to add two numbers
		
		when(calcService.add(10.0, 20.0)).thenReturn(30.0);
		
		//test the add functionality
		
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0);
		//verfiy the behavior
		verify(calcService).add(10.0,20.0);
	}

}
