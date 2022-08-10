package com.Que1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Que1 
{
	public static void main(String[] args) throws Exception 
	{
		HashMap<String,String> M = new HashMap<String,String>(); 
		ArrayList<String> Arr= new ArrayList<String>();
		
		
		 CountryCapital ccap = new CountryCapital();
		 
		 

		 
		M= ccap.saveCountryCapital("India","Delhi");
		M= ccap.saveCountryCapital("Pakistan","Islamabad");
		
	
		 
		for(Entry<String,String> entry : M.entrySet())
		    System.out.println(entry.getKey()+" "+entry.getValue());
		
     
		System.out.println();
		System.out.println("Outpur getCountryCapital");
		System.out.println(ccap.getCapital("India"));
		
		

		System.out.println();
		System.out.println("Outpur getCountry");
		System.out.println(ccap.getCountry("Delhi"));
		
	 
		System.out.println();
		System.out.println("Output reversehashMap");
		 M=ccap.ReverseHashMap();
			for(Entry<String,String> entry : M.entrySet())
			    System.out.println(entry.getKey()+" "+entry.getValue()); 
	
			System.out.println();
			System.out.println("Output CountryList");
			Arr=ccap.CountryList();
			Iterator<String> it = Arr.iterator();
			while(it.hasNext())
				 System.out.println(it.next());
		 
	}

}