package com.BridgeLabz.controller;

import com.BridgeLabz.service.AddressBook;
import com.BridgeLabz.service.AddressBookImp;

public class AddressBookController  
{
	AddressBook addressbook=new AddressBookImp();
	public void createAddressbook( )
	{
		addressbook.createAddressbook();
	}
	public void addPerson( )
	{
	   addressbook.addperson( );
    }
	public void showAddressBook( )
	{
		addressbook.showaddressbook();
	}
	public void deletePerson( )
	{
		addressbook.deleteperson();
	}
	public void editDetails( )
	{
		addressbook.editdetails();
	}
	public void sortByname( )
	{
		addressbook.sortByName();
	}
	public void sortByzip( )
	{
		addressbook.sortByZip();
	}
	public void Search()
	{
		addressbook.search();
	}
}