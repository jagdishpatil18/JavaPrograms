package com.BridgeLabz.Utility;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility u=new Utility();

	}
	public  void binarySearchInteger(int arr [], int n)
    {
       int low,high,mid;
  	   low=0;
  	   high=arr.length-1;
  	   
  	   while(low<=high)
  	   {
  		 mid=(high+low)/2;
  	       if(n<arr[mid])
  	       {
  	         high=mid-1;
                 }
  	       else if(n==arr[mid])
  	       {
  	             System.out.println("Number Found at position "+mid);
  		     break;
  	       }
  	       else
  	       {
                   low=mid+1;
  	       }
  	       mid=(low+high)/2;
  	   }
  	   if(low>high)
  	   {
  		System.out.println("Not Found");
  	   }
    }
  
	public void binarySearchWord(String arr[], String str)
    {
	  int low,high,mid;
 	   low=0;
 	   high=arr.length-1;
 	   
 	   while(low<=high)
 	   {
 		 mid=(high+low)/2;
 	       if(str.compareTo(arr[mid])<0)
 	       {
 	         high=mid-1;
                }
 	       else if(str.compareTo(arr[mid])==0)
 	       {
 	             System.out.println("Word Found at position "+mid);
 		     break;
 	       }
 	       else
 	       {
                  low=mid+1;
 	       }
 	       mid=(low+high)/2;
 	   }
 	   if(low>high)
 	   {
 		System.out.println("Not Found");
 	   }
	  
    }
	
	public void bubbleSort(int arr[])
	{
		
		 for(int i=0;i<arr.length;i++)
		  {
	       for(int j=0;j<arr.length-i-1;j++)
	       {
		       if(arr[j]>arr[j+1])
		       {
		     	  int temp=arr[j];
			      arr[j]=arr[j+1];
			      arr[j+1]=temp;
		       }
		    }
	     }
	 }
	
	 public void insertionSortInt(int arr[])
	 {
		 for(int i=1;i<arr.length;i++)
			{
			    int val=arr[i];
			    int j=i;		
			    while(j>0 && arr[j-1]>val)
			    {
			
		                arr[j]=arr[j-1];
			            j--;
			    }
	                		      
			    
			    arr[j]=val;
			}
		 
	 }
}
