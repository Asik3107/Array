package com.array;

import java.util.ArrayList;
import java.util.List;

public class List_Demo {

	public static void main(String[] args)
	{
		List<Object> j=new ArrayList<Object>();
		
		j.add(20);
		
		j.add(30);
		
		j.add(40);
		
		j.add("Greens Technology");
		
		j.add('k');
		
	   j.add(34.98);
	   System.out.println(j);
	   
	 Object[] a = j.toArray();
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
	String s = j.toString();
	System.out.println(s);
	}

	   
	   
		
		

		
	}


