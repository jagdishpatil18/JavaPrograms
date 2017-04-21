package com.BridgeLabz.Programs;

import java.util.LinkedList;
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
		treeset.add("Apple");
		treeset.add("WallMart");
		
		for(String temp:treeset)
		{
			System.out.println(temp);
		}	
		
		System.out.println(treeset);
	}

}
