package com.oops;


class Animal{
	 void sound()
	 {
		 System.out.println("Animal different sounds ");
	 }
}
class Dog extends Animal{
	 void sound()
	 {
		 super.sound();
		 System.out.println("Dog barks");
	 }
}
class Cat extends Dog{
	void sound()
	{
		super.sound();
		System.out.println("Cat meows");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound();
	}
}
