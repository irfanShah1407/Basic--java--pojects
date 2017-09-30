package com.javaJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddStringTest {

	@Test
	public void addString() {

		
			JunitClass junit=new JunitClass();
			String result=junit.addString("hello", "irfan");
			assertEquals("helloirfan",result);
		}
	

}
