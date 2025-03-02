package com.datatype;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		x=sc.nextInt();
		System.out.print("Enter Second Number:");
		y=sc.nextInt();
		
		System.out.println("Addition :"+(x+y));
		System.out.println("Substraction :"+(x-y));
		System.out.println("Multiplication :"+(x*y));
		System.out.println("Division :"+(x/y));
		System.out.println("Moduless :"+(x%y));
		System.out.println("Is X is greater than to y :"+(x>y));
		System.out.println("Is X is greater than equals to y :"+(x>=y));
		
	}
}
