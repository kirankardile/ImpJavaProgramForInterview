package com.java.program;

public class SystemGroupThread {
public static void main(String[] args) {
	ThreadGroup system=new Thread().currentThread().getThreadGroup().getParent();
	Thread[] t=new Thread[system.activeCount()];
	system.enumerate(t);
	for(Thread t1:t)
	{
		System.out.println(t1.getName()+"========="+t1.isDaemon());
	}
}
}
