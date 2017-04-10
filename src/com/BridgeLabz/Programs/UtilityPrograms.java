package com.BridgeLabz.Programs;
import java.util.*;

import com.BridgeLabz.Utility.Utility;

public class UtilityPrograms 
{	Utility u=new Utility();
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Welcome");
		Scanner sc1=new Scanner(System.in);
		
		UtilityPrograms ut=new UtilityPrograms();
//		Utility u=new Utility();
		int ch;
		
		do
		{	
		System.out.println("1.BinarySearch for Integers ");	
		System.out.println("2.BinarySearch for String ");
		System.out.println("3.InsertionSort for Integers ");
		System.out.println("4.InsertionSort for String ");
		System.out.println("5.BubbleSort for Integers ");
		System.out.println("6.BubbleSort for String ");
		System.out.println("7.Exit");
		System.out.println("Enter your choice");
	     ch=sc1.nextInt();
		
		switch(ch)
		{
		case 1: ut.binaryInt();;
	 	 	    break;
	 	 	   
		case 2: ut.binaryString();
			    break;
		case 3: ut.insertionInt();
			    break;
		case 4: ut.insertionString();
			    break;
		case 5: ut.bubbleInteger();
			    break;
		default :
		}
	}while(ch!=7);
	}
	void binaryInt()
	{
		
		System.out.println("Enter total number of elements ");
		int n=sc.nextInt();
		System.out.println("Enter elements ");
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}	
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
			
		}	
	
		System.out.println("Enter the intger number to be searched");
		int no=sc.nextInt();
	
		Arrays.sort(arr);
		u.binarySearchInteger(arr,no);
		
	}
	
	void binaryString()
	{
		System.out.println("Enter total number of words ");
		int n=sc.nextInt();
		
		System.out.println("Enter words :");
		String [] arr=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
			
		}
		System.out.println("Enter the word to be searched");
		String  str=sc.next();
		Arrays.sort(arr);
        u.binarySearchWord(arr, str);
	}
	
	void bubbleInteger()
	{
		System.out.println("Enter total number of elements ");
		int n=sc.nextInt();
		System.out.println("Enter elements ");
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}	
		System.out.println("Sorted array is :");
		u.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
			
		}
		System.out.println();
	}
	
	void bubbleString()
	{
		System.out.println("Enter total number of words ");
		int n=sc.nextInt();
		
		System.out.println("Enter words :");
		String [] arr=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
			
		}
		
	}
	void insertionInt()
	{
		System.out.println("Enter total number of elements ");
		int n=sc.nextInt();
		System.out.println("Enter elements ");
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}	
		u.insertionSortInt(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
			
		}
	}
	
	void insertionString()
	{
		
		
	}
}
