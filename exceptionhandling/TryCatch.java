package com.exceptionhandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		try {
		System.out.print("Enter A:");
		a=sc.nextInt();
		System.out.print("Enter B:");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Divison :"+c);
		}
		catch(Exception e) {
			System.out.println("Exception Caught :"+e);
		}
		finally {
			System.out.println("Finally Blocked");
		}
		}
	}

