package com.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo 
{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);

		al.add(30);
		al.add(5);
		al.add(9);
		al.add(100);
		al.add(80);
		al.add(90);
		ListIterator it=al.listIterator();
		while(it.hasNext())
		{
			it.next();
			
		}
		
	}
}
