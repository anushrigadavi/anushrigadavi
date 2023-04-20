package com.java.example;

public class loops {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int term=6;
	for(
			int a=1;a<=term;a++) {
		for(int b= term;b>=a;b--) {
			System.out.print("*");
		}
	System.out.println();
	}
}
}