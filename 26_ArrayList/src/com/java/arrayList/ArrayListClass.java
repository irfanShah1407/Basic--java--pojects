package com.java.arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
public static void main(String args[])
{
ArrayList<Integer> myList=new ArrayList<Integer>();
Scanner scan=new Scanner(System.in);
System.out.println("Enter No to Add to Array");
//int size=myList.size();
for(int i=0;i<=10;i++)
{
int user_input=scan.nextInt();
myList.add(user_input);
}
for(int y:myList)
System.out.println("ArrayList contains: "+y);

System.out.println("Enter index to remove element At");
int index=scan.nextInt();
myList.remove(index);
System.out.println("Removed element"+myList);

}	
}
