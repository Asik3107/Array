package com.array;

public class Palindrome1 {

	public static void main(String[] args) 
	{
		String ref = "123321";
		String m="";
		for (int i = ref.length()-1; i >= 0; i--) 
		{
			m=m+ref.charAt(i);//   m="" + namialus
			
		}
		if (ref.equals(m))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome");
		

	}

}
