package com.BridgeLabz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.BridgeLabz.model.Person;

public class AddressBookImp implements AddressBook 
{
	
	
	HashMap<String, LinkedList<Person>> hashmap=new HashMap<String,LinkedList<Person>>();
	LinkedList<Person> list= new LinkedList<Person>();
	String [] addressbook=new String[10];
	Person person;
	Scanner scanner=new Scanner(System.in);
	String key="";
    int numberofaddressbook=0;
    
//	To create new Address book
    @Override
	public void createAddressbook( ) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of address book");
		addressbook[numberofaddressbook]=scanner.next();
		hashmap.put(addressbook[numberofaddressbook], new LinkedList<Person>());
		numberofaddressbook++;
		System.out.println("New Address book created");
	}
    
//    To add new person in address book 
//    No return value
	@Override
	public void addperson()
	{ 
			// TODO Auto-generated method stub
		if(numberofaddressbook==0)
		{	
			System.out.println("Create new address book first");
			System.out.println("Press \n1.Create Addressbook\n2.Exit");
			int newadd=scanner.nextInt();
			if(newadd==1)
			{
				createAddressbook();
		//		numberofaddressbook++;
			}	
			else
				return;
		}	
		
			System.out.println("Address Books are:");
			for(int i=0;i<numberofaddressbook;i++)
			{	
				System.out.println(i+"   "+addressbook[i]);
				
			}	
			System.out.println("Choose Address Book");
			int book=scanner.nextInt();
			key=addressbook[book];
		
		person = new Person();
		
		System.out.println("Enter First name");
	    String firstname=scanner.next();
	    person.setFirstname(firstname);
	    System.out.println("Enter Last name");
	    String lastname=scanner.next();
	    person.setLastname(lastname);
	    System.out.println("Enter Address");
	    String address=scanner.next();
	    person.setAddress(address);
	    System.out.println("Enter city");
	    String city=scanner.next();
	    person.setCity(city);
	    System.out.println("Enter state");
	    String state=scanner.next();
	    person.setState(state);
	    System.out.println("Enter zipcode");
	    String zipcode=scanner.next();
	    person.setZipcode(zipcode);
	    System.out.println("Enter Phone number");
	    long phoneno=scanner.nextLong();
	    person.setPhoneno(phoneno);
	    
	    LinkedList<Person> list= hashmap.get(key);
        list.add(person);   	
        hashmap.put(key, list);
//        showaddressbook();

	}
	

	public void showaddressbook( )
	{
		System.out.println("Address Books are:");
		for(int i=0;i<numberofaddressbook;i++)
		{	
			System.out.println(i+"  "+addressbook[i]);
			
		}	
		if(numberofaddressbook==0)
		{
			System.out.println("No address book present ");
			return;
		}	
			
		System.out.println("Choose Address Book");
		int select=scanner.nextInt();
		String key1=addressbook[select];
		LinkedList<Person> list= hashmap.get(key1);
    	System.out.println("Firstname \tLastname\t Address\t City \t\t State\t\t Zipcode\t\t Phoneno\n");
 //   	hashmap.forEach((k,v)->System.out.println( v));
//		}
    	   	 for(int i=0;i<list.size();i++)
    	     {	
    		System.out.print(hashmap.get(key1).get(i).getFirstname());
    		System.out.print("\t\t"+hashmap.get(key1).get(i).getLastname());
    		System.out.print("\t\t"+hashmap.get(key1).get(i).getAddress());
    		System.out.print("\t\t"+hashmap.get(key1).get(i).getCity());
    		System.out.print("\t\t"+hashmap.get(key1).get(i).getState());
    		System.out.print("\t\t"+hashmap.get(key1).get(i).getZipcode());
    	 	System.out.println("\t\t"+hashmap.get(key1).get(i).getPhoneno());
    	     }  
		
     }
	
//   To delete a person's record from address book
//   on the basis of "Firstname"
	@Override
	public void deleteperson( ) 
	{
		
		System.out.println("Address Books are:");
		for(int i=0;i<numberofaddressbook;i++)
		{	
			System.out.println(i+"  "+addressbook[i]);
			
		}
		System.out.println("Choose Address Book");
		int select=scanner.nextInt();
		String key1=addressbook[select];
		LinkedList<Person> list= hashmap.get(key1);
		System.out.println("Enter the name of person you want to delete");
		String name=scanner.next();
		

		for(int i=0;i<list.size();i++)
		{
			String s=hashmap.get(key1).get(i).getFirstname();
			if(s.equals(name))
			{
				list.remove(hashmap.get(key1).get(i));
				return;
			}	
			
		}
	   System.out.println("No such a person in your contact list");
	  
	}
//   To edit the details of exiting persons record
	@Override
	public void editdetails( ) 
	{
		System.out.println("Address Books are:");
		for(int i=0;i<numberofaddressbook;i++)
		{	
			System.out.println(i+"  "+addressbook[i]);
			
		}
		System.out.println("Choose Address Book");
		int select=scanner.nextInt();
		String key1=addressbook[select];
		LinkedList<Person> list= hashmap.get(key1);
		System.out.println("Enter the name of person whose details you want to edit");
		String fname= scanner.next();
		for(int i=0;i<list.size();i++)
		{
			String s=hashmap.get(key1).get(i).getFirstname();
			if(s.equals(fname))
			{
				int ch;
	//			Person obj=hashmap.get(key).get(i);
		
				do
				{  
					System.out.println("1.Edit Address\n2.Edit City\n3.Edit State\n4.Edit Zipcode\n5.Edit Phone no\n6.Exit");
				    ch=scanner.nextInt();
					switch(ch)
				    {
				    case 1: System.out.println("Enter new Address");
				            String add=scanner.next();
				            list.get(i).setAddress(add);
				            break;
				    case 2: System.out.println("Enter new City");
				    		String ct=scanner.next();
				    		 list.get(i).setCity(ct);
				    		break;
				    case 3: System.out.println("Enter new State");
				    	    String st=scanner.next();
				    	    list.get(i).setState(st);
				    	    break;
				    case 4: System.out.println("Enter zipcode");
				    		String zip=scanner.next();
				    		 list.get(i).setZipcode(zip);
				    		break;
				    case 5: System.out.println("Enter new Phone No");
				    		long ph=scanner.nextLong();
				    		 list.get(i).setPhoneno(ph);
				    		break;
				    default :		
				    }
				}while(ch!=6);
			}	
		
		}
		//		System.out.println("No such a person in your contact list");

	}

	@Override
	public void sortByName( ) 
	{    
		System.out.println("Address Books are:");
		for(int i=0;i<numberofaddressbook;i++)
		{	
			System.out.println(i+"  "+addressbook[i]);
			
		}	
		System.out.println("Choose Address Book");
		int select=scanner.nextInt();
		String key1=addressbook[select];
		LinkedList<Person> arraylist=hashmap.get(key1);
		Collections.sort(arraylist, Person.comparatorname);
		 
	}

	@Override
	public void sortByZip( ) 
	{
		System.out.println("Address Books are:");
		for(int i=0;i<numberofaddressbook;i++)
		{	
			System.out.println(i+"  "+addressbook[i]);
			
		}	
		System.out.println("Choose Address Book");
		int select=scanner.nextInt();
		String key1=addressbook[select];
		
		LinkedList<Person> arraylist=hashmap.get(key1);
		Collections.sort(arraylist, Person.comparatorzip);
		
	   
	}

	   
	
}		



	
	
	
	


