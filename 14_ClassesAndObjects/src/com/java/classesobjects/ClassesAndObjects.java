package com.java.classesobjects;

public class ClassesAndObjects {
	
	public static void main(String args[])
	{
		
		ChildClass my=new ChildClass();//my is instance of a class i.e an object
		my.setId(1);
		my.setName("irfan");
		my.setAge(24);
		
		ChildClass myBrother=new ChildClass();
		myBrother.setId(2);
		myBrother.setName("imran");
		myBrother.setAge(26);
		
		System.out.println("My name is"+my.getName()+" and age is "+my.getAge());//We can get details by using getId as well as object.variable name
		System.out.println("My  Brother name is "+myBrother.name+" and age is "+myBrother.age);
		
		my.setId(3);
		my.setName("Asma");
		my.setAge(27);
		
		System.out.println("My Sister name is "+my.getName()+" and age is "+my.getAge());
		
	}
	
}
