package com.array;

import java.util.ArrayList;
import java.util.List;

public class Converting  {
	public static void main(String[] args) {
		
		/*
		 try {
		 
			int a[] = {1,2,3,4};
	    for (int i = 1; i <=3; i++) {
			System.out.println("a["+i+"]="+a[i]+"n");
		}}
		catch (Exception e) {
 System.out.println("error = "+e);
		}
		//catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println("ArrayIndexOutOfBoundsException");
		//}
		
		*/
		
		int a[] = {1,2,3,4};
		
	    for (int i = 1; i <=3; i++)
	    {
			System.out.println("a["+i+"]="+a[i]+"n");
		}
		
	    String obj1="Geeks";
	    
	    String obj2="Geeks";

	    
		if(obj1.equals(obj2))
			System.out.println("3");
		
		int e=System.identityHashCode(obj1);
		int y=System.identityHashCode(obj2);

		if(obj1.hashCode()!=obj2.hashCode())
			System.out.println("It is equal ");
		else if(obj1==obj2)
		   System.out.println("2");
		else
			System.out.println("Is not equal");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s = "Asik";
    	System.out.println(s);
		
		int l = s.length();
		System.out.println(l);
		
		
		List<Character> call = new ArrayList<Character>	();	
		for (int i = 0; i < l ; i++) {
		    call.add(s.charAt(i));
		}
		System.out.println(call);
	
		String s1 = call.toString();
		System.out.println(s1);
		int length = s1.length();
		System.out.println(length);
	*/
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
