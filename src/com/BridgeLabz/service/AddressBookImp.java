package com.BridgeLabz.service;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.BridgeLabz.model.Person;

public class AddressBookImp implements AddressBook 
{
	
	
	HashMap<String, LinkedList<Person>> hashmap=new HashMap<String,LinkedList<Person>>();
	LinkedList<Person> list =new LinkedList<Person>();
	  String key="family";
	 

	@Override
	public void addperson()
	{ 
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
				Person p1=new Person();
	    System.out.println("Enter First name");
	    String firstname=sc.nextLine();
	    p1.setFirstname(firstname);
	    System.out.println("Enter Last name");
	    String lastname=sc.nextLine();
	   	p1.setLastname(lastname);
	    System.out.println("Enter Address");
	    String address=sc.nextLine();
	    p1.setAddress(address);
	    System.out.println("Enter city");
	    String city=sc.nextLine();
	    p1.setCity(city);
	    System.out.println("Enter state");
	    String state=sc.nextLine();
	    p1.setState(state);
	    System.out.println("Enter zipcode");
	    String zipcode=sc.nextLine();
	    p1.setZipcode(zipcode);
	    System.out.println("Enter Phone number");
	    long phoneno=sc.nextLong();
	    p1.setPhoneno(phoneno);
	 
	  
        list.add(p1);
       hashmap.put(key, list);
      
	}
	
	@Override
	public void createAddressbook() 
	{
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void showaddressbook()
	{
		// TODO Auto-generated method stub
		System.out.println("Address Book Contacts are :");
		System.out.println("firstname \tlastname\t address\t city \t\t state\t\t zipcode\t\t phoneno\n");
    	hashmap.forEach((k,v)->System.out.println( v));
//		hashmap.forEach((k,v)->System.out.println("\nKey : " + k + "\n" + v));
	//	 hashmap.forEach((k,v)->System.out.println("\nKey : " + k + "\nFirstname : " + v.element().getFirstname()+"\nLastname :"+v.element().getLastname()+"\nAddress :"+v.element().getAddress()+"\nCity :"+v.element().getCity()+"\nState :"+v.element().getState()+"\nZipcode :"+v.element().getZipcode()+"\nPhone no:"+v.element().getPhoneno()));
	
 /*       for (Entry<String, LinkedList<Person>> entry : hashmap.entrySet()) {

            String key = entry.getKey();

            List<Person> values = entry.getValue();

 //           System.out.println("Key = " + key);

            System.out.println(values + "n");
*/
        }
	
//	}

	@Override
	public void deleteperson() 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the name of person you want to delete");
		String name=sc.nextLine();
      

//		for(int i=0;i<list.size();i++)
//		{	
//			if(hashmap.get(key).get(i).getFirstname().equalsIgnoreCase(name))
//			{
//				list.remove(hashmap.get(key).get(i));
//				return;
//			}	
//			else
//				System.out.println("No such person in your contact list.");
//		}	
	
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

	@Override
	public void editdetails() 
	{
		 Scanner sc2 = new Scanner(System.in);
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
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
				    ch=sc2.nextInt();
					switch(ch)
				    {
				    case 1: System.out.println("Enter new Address");
				            String add=sc2.next();
				            list.get(i).setAddress(add);
				            break;
				    case 2: System.out.println("Enter new City");
				    		String ct=sc2.next();
				    		 list.get(i).setCity(ct);
				    		break;
				    case 3: System.out.println("Enter new State");
				    	    String st=sc2.next();
				    	    list.get(i).setState(st);
				    	    break;
				    case 4: System.out.println("Enter zipcode");
				    		String zip=sc2.next();
				    		 list.get(i).setZipcode(zip);
				    		break;
				    case 5: System.out.println("Enter new Phone No");
				    		long ph=sc2.nextLong();
				    		 list.get(i).setPhoneno(ph);
				    		break;
				    default :		
				    }
				}while(ch!=6);
			}	
			else
				System.out.println("No such a person in your contact list");
		}
	}
/*		for(int i=0;i<list.size();i++)
		{
			String s=hashmap.get(key).get(i).getFirstname();
			if(s.equals(fname))
			{
				int ch;
		
				   Scanner sc2 = new Scanner(System.in);
	//				System.out.println("1.Edit Address\n2.Edit City\n3.Edit State\n4.Edit Zipcode\n5.Edit Phone no");
	//			    ch=sc2.nextInt();
					
				   
				     System.out.println("Enter new Address");
				     String add=sc2.nextLine();
				     list.get(i).setAddress(add);
				   
				  	System.out.println("Enter new City");
				    String ct=sc2.nextLine();
				   	list.get(i).setCity(ct);
				  
				  	System.out.println("Enter new State");
				    String st=sc2.nextLine();
				    list.get(i).setState(st);
				   
				  	System.out.println("Enter zipcode");
				    String zip=sc2.nextLine();
				    list.get(i).setZipcode(zip);
				   	 
				    System.out.println("Enter new Phone No");
				    long ph=sc2.nextLong();
				    list.get(i).setPhoneno(ph);
				   		
				}        
				    		
		     }
				
		}
*/
	@Override
	public void sortByName() 
	{
		// TODO Auto-generated method stub
		List al=new LinkedList();
		for(int i=0;i<list.size();i++)
		{
			al.add(list.get(i));
		}	
	}

	@Override
	public void sortByZip() 
	{
		// TODO Auto-generated method stub
		
		
	}	
	   
	
}		



	
	
	
	


