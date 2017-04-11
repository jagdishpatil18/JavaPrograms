package com.BridgeLabz.Programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCashCounter 
{
	Scanner sc=new Scanner(System.in);
	String name;
	double balance=0,amount;
	int accountno,i=0;
	double bankbalance=100000;
	Queue queue=new LinkedList();
	accountholder []acc=new accountholder[10];
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice=0;
	
		BankCashCounter bank=new BankCashCounter();
		int ch;
		do
		{
		System.out.println("1.Deposite Cash\n2.Withdraw Cash \n3.Remove\n4.Show\n5.Exit");
		
		System.out.println("Enter your choice");
		 ch=bank.sc.nextInt();
		switch(ch)
		{
		case 1: bank.depositCash();
		        bank.show();
			    break;
		case 2: bank.withdrawCash();
		        bank.show();
			    break;
		case 3: bank.remove();
			    bank.show();
		        break;
		case 4: bank.show();
			    break;
		default :       
		}
		}while(ch !=5);
	}
	void depositCash()
	{   
		System.out.println("Enter your account number ");
		accountno=sc.nextInt();
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter the amount you want to deposit");
		amount=sc.nextDouble();
		
		bankbalance=bankbalance+amount;
		acc[i]=new accountholder(name,accountno,amount);
		queue.add(acc[i]);
//		System.out.println("Total balance in Bank is : "+bankbalance);
	    i++; 
	}
	
	void withdrawCash()
	{
		System.out.println("Enter your account number ");
		accountno=sc.nextInt();
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter the amount you want to withdraw");
		amount=sc.nextDouble();
		acc[i]=new accountholder(name,accountno,-amount);
		queue.add(acc[i]);
	//	balance=balance+amount;
		if(amount<bankbalance)
		bankbalance=bankbalance-amount;
		else
			System.out.println("Cash not available");
//		System.out.println("Total balance in Bank is : "+bankbalance);
	    i++;
	}
	void remove()
	{
	       queue.remove();
	       System.out.println("Total balance in Bank is : "+bankbalance);
	}
	void show()
	{
		System.out.println(" AccountNo   \t    Name     \t     Amount");
//		System.out.println(queue);
		
		Iterator iterator=queue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}	
		
		System.out.println("Total balance in Bank is : "+bankbalance);
	}
	
}

class accountholder
{
	String name;
	int accountno;
	double amount;
	accountholder(String name, int accountno,double amount)
	{
		this.name=name;
		this.accountno=accountno;
		this.amount=amount;
	}
	public String toString()
	{
		
		return accountno+"       \t     " +name+"      \t     "+amount;
		
	}
	
}