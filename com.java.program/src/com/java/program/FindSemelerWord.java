package com.java.program;

public class FindSemelerWord {
	public static void main(String[] args) {
		String[] al= {"Ashish","Ashishhh","Ashishhhhhhhhhhhh"};
		String firstchar=al[0];
		for(int i=0;i<firstchar.length();i++)
		{
			char ch=firstchar.charAt(i);
			
			for(int j=0;j<al.length;j++)
			{
				String str=al[j+1];
				if(ch==str.charAt(j))
				{
					System.out.println(ch);
				}
			}
		}
	
		
 	}

}
