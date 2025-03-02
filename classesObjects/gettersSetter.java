package com.classesObjects;

public class gettersSetter {

	private double balance;
	private String holder;
	
	public gettersSetter(double balance,String holder)
	{
		this.balance=balance;
		this.holder=holder;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	 void display() {
	        System.out.println("Account Holder: " + holder + ", Balance: " + balance);
	    }
	public static void main(String[] args) {
		gettersSetter g=new gettersSetter(20000, "Rajveer");
		g.display();
		g.setBalance(11000);
		System.out.println("Updating Balance is  "+g.getBalance());
		 	
	}
}
