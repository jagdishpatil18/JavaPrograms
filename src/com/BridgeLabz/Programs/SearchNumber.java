package com.BridgeLabz.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchNumber
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
//		HashMap hashmap=new HashMap();
		
		File file=new File("/home/abc/workspace/JavaPrograms/src/com/BridgeLabz/Programs/input.txt");
		FileInputStream fileinputstream=new FileInputStream(file);
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,LinkedList> hashmap=new HashMap<Integer,LinkedList>();
		
		int c=0;
		String str="";
		while((c=fileinputstream.read())!=-1)
		{
	       str=str+(char)c;
	
	    }
		String [] s=str.split(",");
		int []value=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			value[i]=Integer.parseInt(s[i]);
		}	
		int slot=10;
	
	}

}
