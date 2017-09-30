package com.java.staticmethod;

public class Hello {
	public static String DoSomething(String message)
	{
		return message +" You Are Static";
	}
	public String DoSomethingElse(String message)
	{
		return message + " You are non Static " ;
	}
}
