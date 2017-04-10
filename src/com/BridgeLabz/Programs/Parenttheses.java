package com.BridgeLabz.Programs;

import java.util.Scanner;
import java.util.Stack;

public class Parenttheses 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the expression ");
		String exp=sc.nextLine();
		Stack stack =new Stack();

		for(int i=0;i<exp.length();i++)
	    {
	    	char ch=exp.charAt(i);
		
		    if(ch =='(' )
		    {
		    	stack.push('(');
		    }	
		    else if(ch ==')')
	        {
		       if(stack.isEmpty())
		        System.out.println("Stack is empty");
		          
		          stack.pop();
		    }
	    }
	    
	       if(stack.isEmpty())
	       {
	    	   System.out.println("Expression is balanced");
	       }	   
	       else
	    	   System.out.println("Expression is not balanced");
	     
	}
}
