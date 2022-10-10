package com.array;

public class LargestNumber
{

	public static void main(String[] args) 
	{

		int a=100;
		
		int b=120;
		
		int c=200;
		
		     
		if(a>b && a>c) //f &&  f
			System.out.println(a+":It is greatest");
		else if(b>a && b>c)
			System.out.println(b+":It is greatest");
		else
			System.out.println(c+":It is greatest");
		
		
		int largest=(a>b?a:b);
		
		System.out.println(largest);
		
		
		int largest1=c>largest?c:largest;

		System.out.println(largest1);
		
	}

}
