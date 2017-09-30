package com.java.finalKeyword;

public class FinalKeyWord extends StudentDetail{//if student Detail class is final then it will throw error since final class cannot be inherited
	public void mark()//if a method in student detail is final then it could not be overridden
	{
		System.out.println("This is Final class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyWord s1=new FinalKeyWord();
		StudentDetail s2=new StudentDetail();
		//Final vairable name and int can not be reinitialized or values cannot be set again
		s1.getDetails();
		s1.mark();
		s2.mark();
		

		
		
	}

}
