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
	
	Scanner sc=new Scanner(System.in);
	String key;
//	To create new Address book
    @Override
	public void createAddressbook( ) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of address book");
		String addressbookname=sc.next();
			
	}
    
//    To add new person in address book 
//    No return value
	@Override
	public void addperson()
	{ 
			// TODO Auto-generated method stub
		
		Person p1=new Person();
		System.out.println("Enter Address Book name");
		key=sc.next();
	    
		System.out.println("Enter First name");
	    String firstname=sc.next();
	    p1.setFirstname(firstname);
	    System.out.println("Enter Last name");
	    String lastname=sc.next();
	   	p1.setLastname(lastname);
	    System.out.println("Enter Address");
	    String address=sc.next();
	    p1.setAddress(address);
	    System.out.println("Enter city");
	    String city=sc.next();
	    p1.setCity(city);
	    System.out.println("Enter state");
	    String state=sc.next();
	    p1.setState(state);
	    System.out.println("Enter zipcode");
	    String zipcode=sc.next();
	    p1.setZipcode(zipcode);
	    System.out.println("Enter Phone number");
	    long phoneno=sc.nextLong();
	    p1.setPhoneno(phoneno);
	   
        list.add(p1);   	
        hashmap.put(key, list);

	}
	

	public void showaddressbook( )
	{
		
		System.out.println("Enter Address Book name");
		key=sc.next();
		System.out.println("Address Book Contacts are :");
//		System.out.println("Firstname \tLastname\t Address\t City \t\t State\t\t Zipcode\t\t Phoneno\n");
     	hashmap.forEach((k,v)->System.out.println( k));	
//     	if(hashmap.get(key)==null)
//     	{
//     		System.out.println("Enter name of addressbook");
//     		String k=sc.next();
//     		createAddressbook();
//     	}	
//     	
    	System.out.println("Firstname \tLastname\t Address\t City \t\t State\t\t Zipcode\t\t Phoneno\n");
    	hashmap.forEach((k,v)->System.out.println( k));
    	
    	/*   	 for(int i=0;i<list.size();i++)
    	{	
    		System.out.print(hashmap.get(key).get(i).getFirstname());
    		System.out.print("\t\t"+hashmap.get(key).get(i).getLastname());
    		System.out.print("\t\t"+hashmap.get(key).get(i).getAddress());
    		System.out.print("\t\t"+hashmap.get(key).get(i).getCity());
    		System.out.print("\t\t"+hashmap.get(key).get(i).getState());
    		System.out.print("\t\t"+hashmap.get(key).get(i).getZipcode());
    		System.out.println("\t\t"+hashmap.get(key).get(i).getPhoneno());
    	}  
   */
     }
	
//   To delete a person's record from address book
//   on the basis of "Firstname"

	@Override
	public void deleteperson( ) 
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter Address Book name");
		key=sc.next();
		
		System.out.println("Enter the name of person you want to delete");
		String name=sc.nextLine();
		

		for(int i=0;i<list.size();i++)
		{
			String s=hashmap.get(key).get(i).getFirstname();
			if(s.equals(name))
			{
				list.remove(hashmap.get(key).get(i));
				return;
			}	
			
		}
	   System.out.println("No such a person in your contact list");
	  
	}
//   To edit the details of exiting persons record
	@Override
	public void editdetails( ) 
	{
		System.out.println("Enter Address Book name");
		key=sc.next();
		
		System.out.println("Enter the name of person whose details you want to edit");
		String fname= sc.nextLine();
		for(int i=0;i<list.size();i++)
		{
			String s=hashmap.get(key).get(i).getFirstname();
			if(s.equals(fname))
			{
				int ch;
	//			Person obj=hashmap.get(key).get(i);
		
				do
				{  
					System.out.println("1.Edit Address\n2.Edit City\n3.Edit State\n4.Edit Zipcode\n5.Edit Phone no\n6.Exit");
				    ch=sc.nextInt();
					switch(ch)
				    {
				    case 1: System.out.println("Enter new Address");
				            String add=sc.next();
				            list.get(i).setAddress(add);
				            break;
				    case 2: System.out.println("Enter new City");
				    		String ct=sc.next();
				    		 list.get(i).setCity(ct);
				    		break;
				    case 3: System.out.println("Enter new State");
				    	    String st=sc.next();
				    	    list.get(i).setState(st);
				    	    break;
				    case 4: System.out.println("Enter zipcode");
				    		String zip=sc.next();
				    		 list.get(i).setZipcode(zip);
				    		break;
				    case 5: System.out.println("Enter new Phone No");
				    		long ph=sc.nextLong();
				    		 list.get(i).setPhoneno(ph);
				    		break;
				    default :		
				    }
				}while(ch!=6);
			}	
		
		}
		//		System.out.println("No such a person in your contact list");

	}

/*	@Override
	public void sortByName() 
	{    
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=0;i<al.size();i++)
		{
			al.add(hashmap.get(key).get(i));
		
		}	
		Collections.sort(al, new SortbyName(al));
	//   SortbyName sortname=new SortbyName(al);
/*		System.out.println("Sorted List");
		 for(Person per : al)
		 {
	            System.out.println("" + per);
		 }
*/		
	
	

	@Override
	public void sortByName( ) 
	{    
		System.out.println("Enter Address Book name");
		key=sc.next();
		LinkedList<Person> arraylist=hashmap.get(key);
		Collections.sort(arraylist, Person.comparatorname);
//		showaddressbook(String key);

	}

	@Override
	public void sortByZip( ) 
	{
		System.out.println("Enter Address Book name");
		key=sc.next();
		LinkedList<Person> arraylist=hashmap.get(key);
		Collections.sort(arraylist, Person.comparatorzip);
;
		
	}

	   
	
}		



	
	
	
	


