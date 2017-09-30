package com.java.Exceptions;

public class ExceptionHandling {
	public static void main(String args[])
	{
		try{
		int a=100/0;
		System.out.println("Try block");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println("Catch block");
	}
		System.out.println("Exception in Thread");
		

}
}
