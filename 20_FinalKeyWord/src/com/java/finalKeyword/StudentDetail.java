package com.java.finalKeyword;

public  class StudentDetail {
	final String name;
	final int age;
	
	StudentDetail()
	{
		name="irfan shah";
		age=24;
	}
    public  void mark()
    {
    	System.out.println("This is Student detail class");
    }
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+ " age: " +age);
	}

}
