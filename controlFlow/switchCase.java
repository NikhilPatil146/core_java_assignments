package com.controlFlow;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number :");
		a=sc.nextInt();
		System.out.print("Enter Second Number :");
		b=sc.nextInt();
		
		System.out.println("Menu:");
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication");
		System.out.println("4.Divison");
		System.out.println("Enter Your Choice :");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
              System.out.println("Addition :"+(a+b));	
			  break;
		case 2:
			System.out.println("Substraction :"+(a-b));
			  break;
		case 3:
			System.out.println("Multiplication :"+(a-b));
			  break;
		case 4:
			System.out.println("Divison:"+(a-b));
			  break;
		default:
			System.out.println("Invalid number insert");
			break;
		}
	}
}
