package com.BridgeLabz.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
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
		
		File file=new File("/home/abc/workspace/JavaPrograms/hashinput");
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
		LinkedList<Integer>[] list= new LinkedList[slot];
		for(int i=0;i<slot;i++)
		{
			list[i]=new LinkedList<Integer>();
		}	
		
		for(int j=0;j<value.length;j++)
		{
			slot=value[j]%11;
			hashmap.put(slot, list[slot]);
			list[slot].add(value[j]);
		}	
		System.out.println("Hash Map: "+hashmap);
		System.out.println("Enter number to search");
		int num=sc.nextInt();
		
		int k=num%11;
		if(list[k].contains(num))
		{
			list[k].removeFirstOccurrence(num);
		}	
		else
		{
			hashmap.put(k, list[k]);
			list[k].add(num);
		}	
		System.out.println("Hash Map: "+hashmap);
		
		File file1=new File("/home/abc/workspace/JavaPrograms/hashoutput");
		FileWriter filewriter=new FileWriter(file1);
		for(int i=0;i<hashmap.size();i++)
		{
			filewriter.write(hashmap.get(i)+" ");
			filewriter.flush();
		}
		 
		filewriter.close();
		fileinputstream.close();
		sc.close();
	}

}
