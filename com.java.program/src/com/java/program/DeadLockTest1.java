package com.java.program;

public class DeadLockTest1 {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		MyThread1 mt1 = new MyThread1(mt2);
		
		
//		Thread t1 = new Thread(mt1);
		mt1.start();
//		Thread t2 = new Thread(mt2);
		mt2.start();
		
		
	}
}
class MyThread1 extends Thread{
	Thread t1;
	public MyThread1(Thread t1) {
		this.t1=t1;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter is "+i+" "+Thread.currentThread().getName());
			if(i==5)
				try {
					Thread.sleep(500);
					System.out.println("joined");
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Counter is "+i+" "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}