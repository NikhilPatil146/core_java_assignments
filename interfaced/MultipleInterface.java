package com.interfaced;

interface a{
	void geta();
}
interface b{
	void getb();
}

class c implements b,a{

	public void geta() {
		System.out.println("Print A ");
	}
	public void getb() {
		System.out.println("Print B");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		c c1=new c();
		c1.geta();
		c1.getb();
	}
}
