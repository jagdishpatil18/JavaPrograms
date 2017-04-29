package com.BridgeLabz.Programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonmain 
{

	public static void main(String[] args) 
	{
		
		JSONParser parser = new JSONParser();
		
		 try 
		 {
			 
			Object obj = parser.parse(new FileReader("/home/abc/workspace/JavaPrograms/src/com/BridgeLabz/inventry.json"));
			JSONObject jsonobject=(JSONObject) obj;

			JSONArray rice=(JSONArray) jsonobject.get("Rice");
			
			JSONArray pulses=(JSONArray) jsonobject.get("Pulses");
			
			JSONArray wheat=(JSONArray) jsonobject.get("Wheat");
			
			for(int i=0;i<rice.size();i++)
			{
				JSONObject jsonObject2=(JSONObject) rice.get(i);
				System.out.println("\nName: "+jsonObject2.get("name"));
				System.out.println("Weight: "+jsonObject2.get("weight"));
				System.out.println("Price: "+jsonObject2.get("price/kg"));
				
			}
			
			for(int i=0;i<pulses.size();i++)
			{
				JSONObject jsonObject3=(JSONObject) pulses.get(i);
				System.out.println("\nName: "+jsonObject3.get("name"));
				System.out.println("Weight: "+jsonObject3.get("weight"));
				System.out.println("Price: "+jsonObject3.get("price/kg"));
			
			}
			for(int i=0;i<wheat.size();i++)
			{
				JSONObject jsonObject4=(JSONObject) wheat.get(i);
				System.out.println("\nName: "+jsonObject4.get("name"));
				System.out.println("Weight: "+jsonObject4.get("weight"));
				System.out.println("Price: "+jsonObject4.get("price/kg"));
			
			}
			
		} 
		 catch (FileNotFoundException e) 
		 {
			e.printStackTrace();
		 } 
		 catch (IOException e) 
		 {
			e.printStackTrace();
		 } 
		 catch (ParseException e)
		 {
			e.printStackTrace();
    	 }

	}
}
