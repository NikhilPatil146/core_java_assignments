package com.oops;

 class a{
	 void peak()
	 {
		 System.out.println("Print A");
	 }
 }
 class b extends a{
	 void show()
	 {
		 System.out.println("Print B");
	 }
 }
public class signalinheritance {

	public static void main(String[] args) {
		b b1=new b();
		b1.show();
		b1.peak();
	}
	
	
}
