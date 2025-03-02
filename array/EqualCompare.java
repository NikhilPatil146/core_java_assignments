package com.array;

public class EqualCompare {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        
        if (str1.equals(str2)) {
            System.out.println("The strings are equal using equals() method.");
        } else {
            System.out.println("The strings are not equal using equals() method.");
        }

     
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The strings are equal using compareTo() method.");
        } else if (result < 0) {
            System.out.println("str1 is less than str2 using compareTo() method.");
        } else {
            System.out.println("str1 is greater than str2 using compareTo() method.");
        }
    }
}