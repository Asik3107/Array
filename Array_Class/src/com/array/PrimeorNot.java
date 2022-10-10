package com.array;

public class PrimeorNot
{

	public static void main(String[] args)
	{
 
		// Prime Numbers= 1 2 3 5 7 11 13 17 19 23 
		
		// condition greater than one     done
		//second condition  one divisible
		// third condition  divide by itself
		
		int h=6;
		int count =0;
		if (h>1)
		{
			for (int i = 1; i <=11; i++) 
			{
				if (h%i==0)// 11%1  11%2  11%3  11%4  11%11
				{
					count++;// 1 2 
				}
			}
			
		}
		else
			System.out.println(h+" :It is not prime number");
		
		if (count ==2)
		{
			System.out.println(h+ ":It is a PRIME NUMBER");
			
		}
		else
		{
			System.out.println(h+":It is not a prime number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
