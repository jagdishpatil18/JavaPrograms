package com.BridgeLabz.Programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{

	public static void main(String[] args)
    {
		HashSet<String> hashset=new HashSet<String>();
		
		hashset.add("Apple");
		hashset.add("Google");
		hashset.add("WallMart");
		hashset.add("Pandora");
		
		Iterator<String> itr=hashset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			itr.remove();
			System.out.println(hashset);
		
			hashset.add("AgeofEmpire");
			hashset.add("Apple");
			hashset.add("WallMart");
			System.out.println(hashset);
	}

}
