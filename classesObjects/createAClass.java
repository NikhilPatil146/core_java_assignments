package com.classesObjects;

public class createAClass {
    int age;
    String name;
	public createAClass(int age,String name) {
        this.age=age;
        this.name=name;
		
	}
	
	void show() {
		System.out.println("Age: "+age +" Name: "+name);
	}
	public static void main(String[] args) {
		createAClass c=new createAClass(21,"Nikhil");
		c.show();
	}
}
