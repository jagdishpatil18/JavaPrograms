package com.BridgeLabz.service;

import java.util.Comparator;
import java.util.List;

import com.BridgeLabz.model.Person;

public class SortbyName implements Comparator<Person>
{

	private Object list;

	public SortbyName(List al)
	{
		// TODO Auto-generated constructor stub
		this.list=al;
	}

	@Override
	public int compare(Person o1, Person o2)
	{
		// TODO Auto-generated method stub
		System.out.println("..............Hello........");
		int value1=o1.getFirstname().compareTo(o2.getFirstname());
		if(value1==0)
		{
			int value2=o1.getLastname().compareTo(o2.getLastname());
			if(value2==0)
			{
//				return (o2.getPhoneno() < o1.getPhoneno() ? -1 :
//                    (o2.getPhoneno() == o1.getPhoneno() ? 0 : 1));
				 System.out.println(o1.getFirstname());
				 System.out.println(o1.getPhoneno());
			}
			else
				return value2;
			
		}
		return value1;
		
		       
		
	}

	
}
