package com.java.program;

public class SimpleJavaProgram1 {
	public static void main(String[] args) {

		iterateOverArray();

	}

	private static void iterateOverArray() {

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 6; j++) {
				if(j%2==1)continue;
				System.out.print("* \t");
				if(j%5==0)
					break;
			}
			System.out.println();
			if(i==7)
				return;

		}

	}
}
