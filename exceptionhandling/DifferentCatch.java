package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferentCatch {

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
		int arr[]= {1,2,3,4,5};
		System.out.print("Enter Array Index :");
		int index=sc.nextInt();
		System.out.println("Value At Index "+index+" Is :"+arr[index]);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught :"+e);
		}
		catch(InputMismatchException e){
			System.out.println("Exception Caught :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Caught :"+e);
		}
		}
	}

