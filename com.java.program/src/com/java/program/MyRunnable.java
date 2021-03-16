package com.java.program;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10;) {
			System.out.println("Child Thred");
			break;
		}

	}

	public static void main(String[] args) throws InterruptedException {

		new MyRunnable().threadCall();;

	}

	private void threadCall() {
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
			
		}
	}
}