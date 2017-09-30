package com.java.polymorrphism;

public class Polymorphism {
		
	public static void main(String args[])
	{   
		Bank b=new ICICI_Bank();
		System.out.println("ICICI Bank interest Rate: "+b.getRateOfInterest());
		Bank c=new AXIS_Bank();
		System.out.println("Axis Bank Interest Rate: "+c.getRateOfInterest());
		Bank d=new HDFC_Bank();
		System.out.println("hdfc BANK interest Rate: "+d.getRateOfInterest());
	}
}
