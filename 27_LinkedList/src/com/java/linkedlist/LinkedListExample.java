package com.java.linkedlist;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[])
	{
		LinkedList<String> myList=new LinkedList<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String to Add to LinkedList");
		//int size=myList.size();
		for(int i=0;i<=10;i++)
		{
			String user_input=scan.nextLine();
			myList.add(user_input);
		}
		for(String y:myList)
			System.out.println("Linked List contains: "+y);

		System.out.println("Enter index to remove element At");
		int index=scan.nextInt();
		myList.remove(index);
		System.out.println("Removed element"+myList);
		System.out.println("Enter Element To Add Again");
		String user_input=scan.nextLine();
		myList.addFirst(user_input);
		String user_input1=scan.nextLine();
		myList.addLast(user_input1);
		System.out.println("Additional Element at first and last"+myList);
		

	}	

}
