package com.multithreading;


class NewThread implements Runnable
{
    Thread t;
    String tname;
	public NewThread(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+": "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		  e.printStackTrace();	
		}
		System.out.println("Child Thread Existing");
		
	}
	
}

public class Thredas {
 
	public static void main(String[] args) {
		new NewThread("one");
		new NewThread("Two");
		new NewThread("Three");
		Thread t=Thread.currentThread();
		System.out.println(t);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+": "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		  e.printStackTrace();	
		}
		System.out.println("Main Thread Existing");
	}
	}
