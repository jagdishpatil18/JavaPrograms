package com.BridgeLabz.Programs;

import java.util.Scanner;

public class VendingMachine 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total amount");
		int amount=sc.nextInt();
		int []notes={1000,500,100,50,20,10,5,2,1};
		int i=0;
		System.out.println("Change is: ");
		while(amount>0)
		{
			int count=0;
			while(notes[i]<=amount && amount!=0)
			{
				amount=amount-notes[i];
				count++;
			}	
			if(count>0)
			{
				
				System.out.println(notes[i]+"*"+count+" = "+notes[i]*count );
			}	
			i++;
		}	
	}

}
