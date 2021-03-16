package com.java.program;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the element of array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Array Before Sorting : ");

		for (int x : array)
			System.out.print(x + ",");

		System.out.println("\nArray After Sorting : ");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) 
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int x : array)
			System.out.print(x + ",");

	}
}
