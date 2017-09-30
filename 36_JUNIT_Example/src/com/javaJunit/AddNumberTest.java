package com.javaJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumberTest {

	@Test
	public void addNumber() {
		JunitClass junit=new JunitClass();
		int result=junit.addNumber(200, 100);
		assertEquals(300,result);
	}
	

}
