package com.java.student;

public class College {
	
	public static void main(String args[])
	{
		System.out.println("Student details are as follows");
		
		
		Student s=new Student();
		s.setAge(24);
		s.setName("Irfan shah");
		s.display();
		
		Student s1=new Student();
		s1.setAge(26);
		s1.setName("Imran shah");
		s1.display();
		
		Student s2=new Student();
		s2.setAge(27);
		s2.setName("Asma shah");
		s2.display();
		
		Student.getNoOfStudent();
		System.out.println("Total No Of Students: "+Student.getNoOfStudent());
		
		
		
		
		
	}

}
