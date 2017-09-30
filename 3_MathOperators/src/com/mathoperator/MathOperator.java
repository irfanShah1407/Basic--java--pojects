package com.mathoperator;
import java.util.Scanner;

public class MathOperator {

	public static void main(String args[])
	{
		int a,b,add,sub,mul,remainder;
		float div;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Value of a and b to perform arithmatic operation");
		a=scan.nextInt();
		b=scan.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		remainder=a%b;
		System.out.println("You have Entered value of a and b are:"+a +" and "+b);
		System.out.println("Addition is "  +add);
		System.out.println("Substraction is " +sub);
		System.out.println("multilication is " +mul);
		System.out.println("division  is " +div);
		System.out.println("remainder  is " +remainder);
		
		
		
	}
}
