package com.BridgeLabz.Programs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PalindromeChecker
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=sc.nextLine();
	//	List<String> deque=new LinkedList<String>();
		Deque deque=new LinkedList();
		char ch;
		for(int i=0;i<string.length();i++)
		{
			ch=string.charAt(i);
			deque.addLast(ch);
		
		}
//		System.out.println(deque);
		
		String reverse="";
		while(!deque.isEmpty())
		{	
			reverse=reverse+ deque.removeLast();
	//		System.out.println(deque);
		}	
	//	System.out.println(reverse);
		
		if(reverse.equals(string))
		{
			System.out.println("String is Palindrome");
		}	
		else
			System.out.println("String is not Palindrome");
	    sc.close();
	}

}
