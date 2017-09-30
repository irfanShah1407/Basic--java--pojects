package com.java.fileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleIO {
	public static void main(String args[])
	{
		try {
		File f=new File("irfan.txt");//location of the file C:\Users\Hello\JavaInIT\33_FileIO
		if (!f.exists())
		{
			
				f.createNewFile();
			
		}
		
	PrintWriter p=new PrintWriter(f);
	p.println("Hi this is irfan shah");
	p.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

