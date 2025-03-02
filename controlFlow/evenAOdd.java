package com.controlFlow;

import java.util.Scanner;

public class evenAOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
