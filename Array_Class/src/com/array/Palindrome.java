package com.array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter your name");
		String h=y.next();
		String g="";
		for (int i = h.length()-1; i >=0; i--) 
		{
		    g=g+h.charAt(i);
			
		}
		System.out.println(g);
		if (g.equals(h)) 
					System.out.println("It is a palindrome:");
		
		else
			System.out.println("It is not a palindrome");
	}

}
