package com.java.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String args[])
	{
		Date s=new Date();
		System.out.println("Unformatted Date");
		System.out.println(s.toString());
		
		SimpleDateFormat format=new SimpleDateFormat("M/d/Y");
		System.out.println(format.format(s));
	}

}
