package com.java.staticmethod;

public class StaticKeyWord {
	public static void main(String args[])
	{
		Hello h=new Hello();
		String s=Hello.DoSomething("Hi this is irfan");
		System.out.println(s);
		String t=h.DoSomethingElse("HI this is irfan");
		System.out.println(t);
	}

}
