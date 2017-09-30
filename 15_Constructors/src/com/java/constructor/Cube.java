package com.java.constructor;

public class Cube {
	int length,breadth,height;
	public int getCubeVolume()
	{
		return length*breadth*height;
	}
	
	Cube(){
		 length=100;
		  breadth=40;
		  height=10;
	}
	
	Cube(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
		
	}
	

}
