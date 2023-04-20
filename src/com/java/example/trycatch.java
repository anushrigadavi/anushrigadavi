package com.java.example;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		try
		{
			
			int a,b,c;
			Scanner input =new Scanner(System.in);
			
			
			System.out.print("Enter first number : ");
			a=input.nextInt();
       
			System.out.print("Enter second number : ");
			b=input.nextInt();
       
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		

	}

}
