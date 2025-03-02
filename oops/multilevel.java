package com.oops;

class a1{
	 void peak()
	 {
		 System.out.println("Print A");
	 }
}
class b1 extends a1{
	 void show()
	 {
		 System.out.println("Print B");
	 }
}
class c extends b1{
	void display()
	{
		System.out.println("Print C");
	}
}
public class multilevel {

	public static void main(String[] args) {
		c c1=new c();
		c1.peak();
		c1.show();
		c1.display();
	}
}
