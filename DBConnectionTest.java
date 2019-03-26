package com.niit.mockito;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;

public class DBConnectionTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	

	@InjectMocks private DBConnection dbConnection;
	  @Mock private Connection mockConnection;
	  @Mock private Statement mockStatement;
	 
	  @Before
	  public void setUp() {
	    MockitoAnnotations.initMocks(this);
	  }
	 
	  @Test
	  public void testMockDBConnection() throws Exception {
	    Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
	    Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
	    int value = dbConnection.executeQuery("");
	    Assert.assertEquals(value, 1);
	    Mockito.verify(mockConnection.createStatement(), Mockito.times(1));
	  }

}
