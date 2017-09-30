package com.java.SwitchStatement;
//for checking multiple condition to check
public class SwitchStatement {
	public static void main(String args[])
	{
		int a=65;
		switch(a)
		{
		case 100:
			System.out.println("Very good");
			break;
		case 80:
			System.out.println(" Good");
			break;
		case 60:
		case 65:
			System.out.println("Average");
			break;
		case 50:
			System.out.println("poor");
		default:
			System.out.println("No Grades");
		}
			
	}

}
