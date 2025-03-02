package com.array;
import java.util.Scanner;
public class ReversString {
    public static void main(String[] args) {
    	String s,rev;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String:");
        s = sc.nextLine();
        rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: " + rev);
        if(s.equalsIgnoreCase(rev))
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not A Palindrone");
        }
       
    }
}
