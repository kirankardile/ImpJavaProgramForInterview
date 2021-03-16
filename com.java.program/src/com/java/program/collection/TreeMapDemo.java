package com.java.program.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map=new TreeMap<Integer, String>(new MyComparator());
		
		map.put(101, "Kiran");
		map.put(501, "Balu");
		map.put(302, "Sachin");
		map.put(105, "Amol");
		map.put(120, "Vikas");
		map.put(115, "Ravi");
		System.out.println(map);
	}
}

class MyComparator implements Comparator
{

	//Descending by using key
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1>i2)
			return -1;
		
		else if(i1<i2)
			return +1;
		
		return 0;
	}
	}