package com.BridgeLabz.Programs;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> treeset=new TreeSet<String>();
		treeset.add("Apple");
		treeset.add("Google");
		treeset.add("WallMart");
		treeset.add("Pandora");
		treeset.add("AgeofEmpire");
		
		treeset.add("WallMart");
		
		for(String temp:treeset)
		{
			System.out.println(temp);
		}	
		treeset.remove("Apple");
		System.out.println(treeset);
	}

}
