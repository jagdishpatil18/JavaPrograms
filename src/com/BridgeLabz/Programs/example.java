package com.BridgeLabz.Programs;

public class example 
{

	public static void main(String args[])
	{		hashcodeexp emp1 = new hashcodeexp(23);
			hashcodeexp emp2 = new hashcodeexp(23);
			System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));
	
			hashcodeexp emp3 = new hashcodeexp(24);
			hashcodeexp emp4 = new hashcodeexp(25);
			System.out.println("emp3.equals(emp4)--->>>"+emp1.equals(emp2));
			System.out.println("Hashcode for emp1 : "+emp1.hashCode());
			System.out.println("Hashcode for emp2 : "+emp2.hashCode());
			System.out.println("Hashcode for emp3 : "+emp3.hashCode());
			System.out.println("Hashcode for emp4 : "+emp4.hashCode());
			System.out.println("Hashcode for emp1 : "+emp1.hashCode());
			
	}
	
	

}

