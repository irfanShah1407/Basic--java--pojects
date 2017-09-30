package com.java.ifelse;

import java.util.Scanner;

public class If_ElseExample {
     
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String userinput=scan.next();
	if(userinput.equals("irfan"))
	{
		System.out.println("Your user name is Valid");
		System.out.println("Enter Pin");
		int pin=scan.nextInt();
		if(pin==1234)
		{
			System.out.println("Valid pin");
		}
		else
		{
			System.out.println("Please Enter valid pin");
		}
	}
	else{
		System.out.println("Your user name is invalid");
		main(args);
	}
	}
	
	
}
