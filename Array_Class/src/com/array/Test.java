package com.array;

public class Test {
	 public static void main(String[] args) {
		  // string methods
		/* String s = "asik";
		 int length = s.length();
		 System.out.println(length);
		 
		 boolean equals = s.equals("asik");
		 System.out.println(equals);
		 
		 boolean l1 = s.equalsIgnoreCase("AsIk");
		 System.out.println(l1);
		 
		 String l2 = s.toUpperCase();
		 System.out.println(l2);
		 
		 String l3 = s.toLowerCase();
		 System.out.println(l3);
		 
		 char l4 = s.charAt(0);
		 System.out.println(l4);
		 */
		// String a = "asik";
	//	System.out.println( System.identityHashCode(a));
		
		//
		for (int i = 1; i <=4; i++) {  //1<4 2<4  3<4 4<4
			
			for (int j = 1; j<=i; j++) {//1<1 
				                        //1<2 2<2
				                        //1<3 2<3 3<3
				                        //1<4 2<4 3<4 4<4  
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		for (int i = 4; i >=1 ; i--) {   //4>1 3>1 2>1 1>1
			
			for (int j = 1; j<=i; j++) {//1<4 2<4 3<4 4<4
				                        // 1<3 2<3 3<3 
			                         	// 1<2 2<2 
				System.out.print("*");  // 1<1
			}
			
			System.out.println();
		}
		
		System.out.println("sulaiman");
		
		for (int i = 1; i<=4; i++)
		{
			for (int j = i; j<=4; j++) 
			{
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		
		
		//1234     //
		//234
		//34
		//4
		
		for (int i =1; i <=4; i++)
		{
			for (int j =i; j<=4; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		//Reverse the string using string buffer 
		
		String h="Lokesh";
		
		StringBuffer n=new StringBuffer(h);
		
		n.reverse();
		
		System.out.println(n);
		
		//Reverse using for loop
		
		
		String h1="Lokesh";

		for (int i = h1.length()-1; i>=0; i--) 
		{
			System.out.print(h1.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
	
	
	
	
	
	}
	

}
