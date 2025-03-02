package com.interfaced;

abstract class Animal {
 abstract void makeSound();
 void sleep() {
     System.out.println("This animal is sleeping.");
 }
}

 class Dog extends Animal {
 void makeSound() {
     System.out.println(" dog Sound ");
 }
 
 }
public class Abstractc {
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		d.sleep();
	}
}