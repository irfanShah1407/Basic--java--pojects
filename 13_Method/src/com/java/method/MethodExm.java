package com.java.method;

public class MethodExm {
	public static void main(String args[])
	{
		firstMethod();//simple method without param
		secondMethod("irfan");//method with String param but not returning any value
		thirdMethod(10,20);//method with integer value as param
		thirdMethod(10,200);
		int val=fourthMethod(100,500);//method with integer param and returning int value
		thirdMethod(val,20);
		float percent=percentage(125,200);
		System.out.println("Percentage :"+percent);
	}
	public static void firstMethod(){
		
		System.out.println("Hi This is irfan working with java methods");
		}
	
	public static void secondMethod(String name)
	{
		System.out.println("Hello "+name);
	}
	
	public static void thirdMethod(int a,int b)
	{
		
	int c=a+b;
	System.out.println("Addition of no is:"+c);
	
		
	}
	public static int fourthMethod(int a,int b)
	{   int c=a+b*100;
	System.out.println("Addition * 100 is:"+c);
		return c;
	}
	public static float percentage(float a,float b)
	{
		
		
		float percent=a/b*100;
		return percent;
	}
	

}
