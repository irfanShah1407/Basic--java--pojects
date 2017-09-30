package com.java.hashSet;

import java.util.HashSet;

import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> list=new HashSet<String>();
		list.add("irfan");
		list.add("shiba");
	
		Iterator<String> str=list.iterator();
		while(str.hasNext())
		{
		System.out.println(str.next());
		}
	}

}
