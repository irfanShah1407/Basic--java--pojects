package com.java.listIterator;

import java.util.*;

public class ListIterators {
	public static void main(String args[])
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("irfan");
		names.add("imran");
		names.add("Asma");
		names.add("shiba");
		
		
		System.out.println(names);
		ListIterator<String> list=names.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
				
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}

}
