package com.method;

public class staticV {
	 
	static int x=10;
	static void update(int y)
	{
		x=y;
	}
	
	static void show()
	{
		System.out.println("Update value of :"+x);
	}
	public static void main(String[] args) {
	    staticV.show();
		staticV.update(12);
		staticV.show();
	}
}
