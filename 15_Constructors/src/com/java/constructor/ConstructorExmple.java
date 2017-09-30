package com.java.constructor;

public class ConstructorExmple {
	public static void main(String args[])
	{
		Cube c=new Cube();
		System.out.println("Volume of the First Cube is "+c.getCubeVolume());
		Cube c2=new Cube(10,20,30);
		System.out.println("Volume of the Second Cube is "+c2.getCubeVolume());
		
	}

}
