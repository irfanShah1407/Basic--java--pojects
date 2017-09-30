/**
 * 
 */
package com.java.methodOverloading;

/**
 * @author Hello
 *
 */
public class MethodOverloading {
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		int result=m.add(5, 6);
		System.out.println(result);
		double result1=m.add(25.2, 5.6);
		System.out.println(result1);

	}

	
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
}
