package com.java.accessModifier;

public class AccessModifier {
	
	
/*	Access Levels 
	Modifiers    	class packages subclass World
	public    			Y     Y        Y        Y
	protected 			Y     Y        Y	    Y
	No modifier  	    Y     Y        N        N
	private				Y     N        N        N*/
	
	
	public static void main(String args[])
	{
		Students s1=new Students();
		s1.setAge(55);
		s1.setName("ZAFAR HAKAM");
		//here we can not access with directly variable name we have to specify getName() bcoz variables are private 
		System.out.println("Name: "+s1.getName()+" Age: "+s1.getAge());
		
	}

}
