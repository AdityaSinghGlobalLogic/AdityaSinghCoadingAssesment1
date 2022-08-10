package com.Que1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountryCapital 
{
	HashMap<String,String> M1 = new HashMap<String,String>();
	
	
	
	HashMap<String,String> saveCountryCapital(String CountryName, String capital) 
	{
		M1.put(CountryName,capital);
		return M1;
	}
	
	
	String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	
	
	String getCountry(String capitalName)
	{
		String CountryName="Not Present";
		for(Entry<String,String> entry : M1.entrySet())
		{
			if(entry.getValue()==capitalName)
			{
				CountryName=entry.getKey();
			}
		}
		return CountryName;
	}
	
	HashMap<String,String> ReverseHashMap()
	{
		HashMap<String,String> M2 = new HashMap<String,String>();
		
		for(Entry<String,String> entry : M1.entrySet())
		{
			M2.put(entry.getValue(),entry.getKey());
		}
		return M2;
	}
	
	ArrayList<String> CountryList()
	{
		ArrayList<String> Ar= new ArrayList<String>();
		Iterator<String> it = M1.keySet().iterator();
		
		while(it.hasNext())
			 Ar.add(it.next());
		return Ar;
		
	}

}