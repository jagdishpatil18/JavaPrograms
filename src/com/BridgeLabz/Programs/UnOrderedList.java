package com.BridgeLabz.Programs;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class UnOrderedList {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f1=new File("/home/abc/workspace/JavaPrograms/text");

		FileInputStream f=new FileInputStream(f1);
		Scanner sc=new Scanner(System.in);
		LinkedList <String>al=new LinkedList<String>();

		int c=0;
		String str="";
		while((c=f.read())!=-1)
		{
	       str=str+(char)c;
	
	    }
		String [] s=str.split("\\s");
		for(int i=0;i<s.length;i++)
		{
			al.add(s[i]);
		}	
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		System.out.println("Enter word to search ");
		String str1=sc.next();
		
		FileWriter fw=new FileWriter(f1);	
          if(al.contains(str1))
		  {
        	  al.remove(str1);
        	for(int i=0;i<al.size();i++)
        	{
        	   fw.write(al.get(i)+" ");
        	   fw.flush();
        	}	
			
		  }
          else
          {
        	  al.add(str1);
          
              for(int i=0;i<al.size();i++)
      	      {
        	  	fw.write(al.get(i)+" ");
      	   		fw.flush();
      	      }
          }
      	Iterator<String> itr2=al.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}	
	
		
	}

}
