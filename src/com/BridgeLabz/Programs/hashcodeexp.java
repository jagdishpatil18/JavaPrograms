package com.BridgeLabz.Programs;

public class hashcodeexp 
{
	
		private int age ;
		
		public hashcodeexp( int age )
		{
			super();
			this.age = age;
		}
		
		public int hashCode()
		{
			return age;
		}
		
		public boolean equals( Object obj )
		{
			boolean flag = false;
			hashcodeexp emp = ( hashcodeexp )obj;
			if( emp.age == age )
				flag = true;
			return flag;
		}
	}
	

