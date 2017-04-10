package com.BridgeLabz.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		File f1=new File("/home/abc/workspace/JavaPrograms/inputfile.txt");
		FileInputStream f=new FileInputStream(f1);
		Scanner sc=new Scanner(System.in);
		LinkedList <String>al=new LinkedList<String>();
		int c;
		String str ="";
		while((c=f.read())!=-1)
		{
	      str=str+(char)c;
	
	    }
		String [] s=str.split(",");
		for(int i=0;i<s.length;i++)
		{
			al.add(s[i]);
		}	
		
		Iterator<String> itr=al.iterator();
	  
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		System.out.println("Enter number to search ");
		String str1=sc.next();
		
		FileWriter fw=new FileWriter(f1);	
          if(al.contains(str1))
		  {
        	  al.remove(str1);
        	 // Collections.sort(al);
        	for(int i=0;i<al.size();i++)
        	{
        	   fw.write(al.get(i)+" ");
        	   fw.flush();
        	}	
			
		  }
          else
          {
        	  al.add(str1);
        	  Collections.sort(al);
        	 
              for(int i=0;i<al.size();i++)
      	      {
        	  	fw.write(al.get(i)+",");
      	   		fw.flush();
      	      }
          }
//          Collections.sort(al);
      	Iterator<String> itr2=al.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}	
	

	}

}
