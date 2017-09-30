package com.java.student;

public class Student {
	String name;
	int age;
   static int noOfStudents=0;
   static String college="JD Edward Engineering";
   
   Student()
   {
	  noOfStudents++;  
   }
   void display()
   {
	   System.out.println(noOfStudents +" Name: " +name+ " age: " +age+ " College: "+college );
   }

   public static int getNoOfStudent()
   {
	   return noOfStudents;
   }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
