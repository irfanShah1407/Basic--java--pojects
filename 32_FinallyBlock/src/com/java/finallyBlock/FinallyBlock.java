package com.java.finallyBlock;

public class FinallyBlock {
	
	public static int ret(){
		{
			int a=100;
			try{
			a=a/0;
			System.out.println("Try block");
			return a;
			}
			catch(Exception e)
			{
			e.printStackTrace();
			System.out.println("Catch block");
			return a;
		}
			finally{
			System.out.println("Exception in Thread");
			}
	}
	}
	public static void main(String args[])
	{
	System.out.println(ret());

}

}
