package com.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_Demo
{
	
	public static void main(String[] args) 
	{
	   List<Integer> l=new LinkedList<Integer>();
	   
	   l.add(45);
	   
	   l.add(54);
	   
	   l.add(45);
	   
	   l.add(30);
	   
	   l.add(90);
	   
	   l.add(null);
	   
	   l.add(null);
	   
	   l.add(25);
	   
	   l.add(26);
	   
	   l.add(27);
	   
	   l.add(29);
	   
	   l.add(25);
	   
	   System.out.println(l);
	   
	   l.add(3, null);
	   
	   System.out.println(l);
	   
	  int a = l.size();
	  System.out.println(a);
	  
	  int b =l.indexOf(26);
	  System.out.println(b);
	  
	  int c = l.lastIndexOf(25);
	  System.out.println(c);
	   
	   boolean d = l.contains(110);
	   System.out.println(d);
	   
	   Integer e = l.get(0);
	   System.out.println(e);
	   
	  // Integer f = p.get(15);
	  // System.out.println(f);
	   
	   l.set(0, 10);
	   System.out.println(l);
	   
	   System.out.println(l.isEmpty());
	   
	   //System.out.println(p.lastIndexOf(25));
	   l.remove(3);	  
	   System.out.println(l);
		
	  // p.clear();
	  // System.out.println(p);
	   
	   System.out.println("*****************************************************************");
	   
      List<Integer> l1=new ArrayList<Integer>();
	   
	   l1.add(45);
	   
	   l1.add(54);
	   
	   l1.add(45);
	   
	   l1.add(30);
	   
	   l1.add(90);
	   
	   l1.add(null);
	   
	   l1.add(25);
	   
	   l1.add(999);
	   
	   l1.add(26);
	   
	   l1.add(27);
	   
	   l1.add(29);
	   
	   
	  // p.removeAll(p1);
	  //System.out.println(p);
	   
	   System.out.println(l);
	   
	   System.out.println(l1);
	   
	   System.out.println("Size of list:"+l1.size());

	   //l.retainAll(l1);
	   //System.out.println(l);
	   
	  // l1.removeAll(l);
	   //System.out.println(l1);
	   
	/*
	   Object[] a1 = l1.toArray();
	   
	   for (int i = 0; i <=a1.length-1; i++)
	   {
		   System.out.println(a1[i]);
		
      	}
	 */  
	   String j="parachute";
	   String s = l1.toString();
	   
       System.out.println(s);	  
       System.out.println(s.length());
	   
	   
	}
}
