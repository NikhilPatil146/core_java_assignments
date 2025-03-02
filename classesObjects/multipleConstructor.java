package com.classesObjects;

public class multipleConstructor {

	 int age;
	 String name;
	public multipleConstructor() {
       age=10;
       name="Nikhil";
	}
	
	public multipleConstructor(int age,String name) {
     
		this.age=age;
		this.name=name;
	}
	
	void show()
	{
		System.out.println("Age: "+age +" Name: "+name);
	}
	
	public static void main(String[] args) {
		multipleConstructor m1=new multipleConstructor();
		multipleConstructor m2=new multipleConstructor(23, "Yash");
		
		m1.show();
		m2.show();
	}
}


