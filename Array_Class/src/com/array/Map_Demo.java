package com.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Demo 
{
	public static void main(String[] args) 
	{
		/*
		Map<Object, String> k=new TreeMap<Object, String>();
		
		k.put('U', "Sulaiman");
		
		k.put(null, "Mohammed");
		
		k.put(null,"Tom");
		
		k.put('U', "Karthick");
		
		System.out.println(k);
		*/
		
	   Map<Integer,String> j=new ConcurrentHashMap<Integer,String>();
		
		j.put(4,"K");

		j.put(1,"Asik");
		
		j.put(6,"True");
		
		j.put(6,"56.9");
		
		j.put(1,"56.9");
		
		j.put(4,"Sulaiman");

		System.out.println(j);
		
		
		//Collection<String> y = j.values();
		
		//System.out.println(y);
		

		Set<Entry<Integer, String>> entrySet = j.entrySet();

		System.out.println("EntrySet:"+entrySet);
		
		boolean y = j.containsKey(4);
		System.out.println(y);
		
		boolean y1 =j.containsValue("Sulaiman");
		System.out.println(y1);
		
	
		List<Integer>n=new ArrayList<Integer>();
		
		n.add(90);
		
		n.add(98);
		
		n.add(87);
		
		n.add(76);
		
		System.out.println(n);
		
		/*for(Integer h: n)
		{
			System.out.print(h);
		}
		System.out.println();
		
		for (int i = 0; i <=n.size()-1; i++) 
		{
			System.out.println("Using forloop :"+n.get(i));
			
		}
		*/
		
		
	}
	

}
