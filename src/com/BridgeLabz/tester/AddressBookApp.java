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
		 
		AddressBookController  controller=new AddressBookController();
		do
		{	
			System.out.println();
			System.out.println("1.CreateAddressBook\n2.ShowAddressBook\n3.Add Person\n4.Delete Person\n5.Edit Details \n6.sortByName\n7.sortByZip\n8.Search\n9..Exit");
		
		    choice=sc1.nextInt();
		
			switch(choice)
			{
			case 1:  controller.createAddressbook();
					 break;
			case 2:  controller.showAddressBook();
					 break;
			    
			case 3:  controller.addPerson();
			      	 break;
			case 4:  controller.deletePerson();
				     break;
			case 5:	 controller.editDetails();
					 break;
			case 6:  controller.sortByname();
				     break;
			case 7:  controller.sortByzip();
				     break;
			case 8: controller.Search();	     
			default :
			}
		}while(choice!=9);	
		
	}

}
