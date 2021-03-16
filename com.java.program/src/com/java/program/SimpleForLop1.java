package com.java.program;

import java.util.Iterator;

public class SimpleForLop1 {
	public static void main(String[] args) {
		checkForLoop();
	}

	static void checkForLoop() {

		outer: for (int i = 0; i < 5; i++) {
			inner: for (int j = 0; j < 5; j++) {
				if(j==3)continue outer;
				System.out.print("* \t");
				if(j==4)
					break outer;
			}

		}
	}

}
