package com.Masai;

import java.util.Scanner;

public class StringReverse {
	
	public static String  reversString(String str) 
	{
		int x=str.length();
		String arr="";
		for(int i=x-1;i>=0;i--)
		{
			arr+=str.charAt(i);
		}
		return arr;
	}

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);

	}

}
