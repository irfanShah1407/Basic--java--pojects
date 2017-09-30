package com.java.forloop;

public class ForLoop {

		public static void main(String args[])
		{
			
			/* ways of defining and initializing array
			int array[];
			int[] array;
			int[] array=new int[3];
			int[] array={1,2,3};
			int[] array=new int[]{1,2,3};
			*/
			
			int[] array={1,2,3};
			/*We can use For loop in folloeing two ways
			First way*/
			
			System.out.println("=====First way======");
			for(int i=0;i<=2;i++)
			{
				System.out.println("Current value of array[i]:"+array[i]);
			}
			//second way
			System.out.println("=====Second way======");
			for(int element:array){
				System.out.println("current value of element:"+element);
				
			}
			
		}

	}

