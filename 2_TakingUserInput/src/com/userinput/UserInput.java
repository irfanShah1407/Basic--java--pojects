package com.userinput;
import java.util.Scanner;

public class UserInput {

		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any no and name");
			
			/*
			 * nextInt() describes user input must be integer 
			 * if apart from int needed we can cahnge as per variable type
			 * like nextDouble(),next()...etc
			 */
			int user_input=scan.nextInt();
			String user_string=scan.next();
	
			
			System.out.println("Entered No and name are");
			System.out.println(user_input +"-"+user_string);
			
		}
}

