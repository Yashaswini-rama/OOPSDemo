package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable(), "t1");
		Thread t2=new Thread(new HeavyWorkRunnable(), "t2");
		System.out.println("Starting Runnable Threads");
		t1.start();	
		t2.start();
		System.out.println("Runnable threads has been started");
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		System.out.println("Strating MyThreads");
		t3.start();
		t4.start();
		System.out.println("MyThreads has been strated");
		
	}

}
