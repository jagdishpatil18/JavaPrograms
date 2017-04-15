package com.BridgeLabz.tester;

import java.util.Scanner;

import com.BridgeLabz.controller.AddressBookController;

public class AddressBookApp
{

	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		// TODO Auto-generated method stub
		int choice;
		String key;
		 
//		 System.out.println("Enter the key");
//		 key=sc1.nextLine();
     	 AddressBookController  controller=new AddressBookController();
		do
		{	
			
			System.out.println("1.AddressBook\n2.Add Person\n3.Delete Person\n4.Edit Details \n5.sortByName\n6.sortByZip\n7.Exit");
		
		    choice=sc1.nextInt();
		
			switch(choice)
			{
			case 1:  controller.showAddressBook();
					 break;
			    
			case 2:  controller.addPerson();
			      	 break;
			case 3:  controller.deletePerson();
				     break;
			case 4:	 controller.editDetails();
					 break;
			case 5:  controller.sortByname();
				     break;
			case 6:  controller.sortByzip();
				     break;
			default :
			}
		}while(choice!=7);	
		
	}

}
