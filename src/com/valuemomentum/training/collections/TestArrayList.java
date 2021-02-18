package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		
		al.add("Jim");
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
