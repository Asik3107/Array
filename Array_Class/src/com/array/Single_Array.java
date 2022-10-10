package com.array;

public class Single_Array {
	
	
	
	
	public static void main(String[] args) {
		int call [] = new int [4];
		call[0]=10;
		call[1]=20;
		call[2]=30;
		call[3]=40;
		call[2]=300;
		/*for (int i = 0; i < call.length; i++) {
			
		
		System.out.println(call[i]);
		
		}*/
		for (int i : call) {
			System.out.println(i);
			
		}
		
		
	
		
}
}