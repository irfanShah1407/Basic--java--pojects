package com.java.inheritence;

public class Inheritence {
	
	public static void main(String args[])
	{
		Rectangle rec=new Rectangle();
		Triangle tri=new Triangle();
		
		rec.set_values(20, 20);
		tri.set_values(25, 25);
		
		System.out.println("Area of Rectangle: "+rec.area());
		System.out.println("Area of Triangle: "+tri.area());
		
		
		
	}

}
