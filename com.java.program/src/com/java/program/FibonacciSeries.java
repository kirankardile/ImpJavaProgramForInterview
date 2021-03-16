package com.java.program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNo=0,secondNo=1;
		int result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Fibonacci Series :- ");
		int size=sc.nextInt();
		sc.close();
		System.out.print(firstNo+","+secondNo);
		for(int i=0;i<size-2;i++)
		{
			result=firstNo+secondNo;
			firstNo=secondNo;
			secondNo=result;
			System.out.print(","+result);
		}
		

	}

}
