package com.java.program;

public class PrintDuplicateElementFromTwoAray {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 2, 15, 10,50 };
		int[] array2 = { 56, 98, 9, 3, 50, 2, 10 };

		System.out.println("Duplicate Element : ");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) 
			{
				if(array1[i]==array2[j])
				{
					System.out.print(array1[i]+ " ");
				}
				
			}
		}
	}
}
