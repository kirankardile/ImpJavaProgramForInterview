package com.java.program;

public class TryCatchDemo {
	public static void main(String[] args) {
		int i;
		try {
			i = 10 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			i = 5 / 1;
			System.out.println("in catch ");
		}finally {
			System.out.println("called fnally");
		}

		System.out.println("continue running ");
	}
}
