package com.java.program;

public class TrycatchDemo2 {
	public static void main(String[] args) {
		System.out.println(checktrycatch1());
	}

	static int checktrycatch1() {
		int i = 10;
		try 
		{
			i = i / 0;
			return 3;
		} catch (Exception e) {
			// TODO: handle exception
			return 5;
		} finally {
			// TODO: handle finally clause
			return 10;
		}

	}
}
