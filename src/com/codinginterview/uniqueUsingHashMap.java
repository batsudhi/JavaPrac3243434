package com.codinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class uniqueUsingHashMap {
	public static void main(String[] args) {
		
		String a =  "india is the best and it is the best in the world";
		countWordsInASentence(a);
	}
	
	public static void countWordsInASentence(String a)
	{
		Map<String, Integer> m = new HashMap<String,Integer>();
		String[] arr = a.split(" ");
		for (String b : arr)
		{
			if ((m.get(b) == null))
			{
				m.put(b, 1);
			}
			else 
				m.put(b, m.get(b)+1);
		}
		
		Set<String> set = m.keySet();
		for (String d : set)
		{
			System.out.println(d + " - "+m.get(d));
		}
		
	}

}
