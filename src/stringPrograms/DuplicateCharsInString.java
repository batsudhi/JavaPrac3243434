package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	//Program: Write a program to find out duplicate characters in a string.
	
	/*Description:
		Write a program to find out duplicate or repeated characters in a
		string, and calculate the count of repeatation.*/
	
	 public static void main(String a[]){
	        DuplicateCharsInString dcs = new DuplicateCharsInString();
	        dcs.findDuplicateChars("Java2Novice");
	    }

	private void findDuplicateChars(String string) {
		
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] chrs = string.toCharArray();
		
		for(Character c: chrs)
		{
			if(dupMap.containsKey(c))
			{
				dupMap.put(c, dupMap.get(c)+1);
			}
			else
				dupMap.put(c, 1);
		}
		
		Set<Character> keys = dupMap.keySet();
		for(Character c: keys)
		{
			if(dupMap.get(c) >1)
			{
				System.out.println(c+"---"+dupMap.get(c));
			}
			
		}
		for(Character c: keys)
		{
			System.out.println(c+"---"+dupMap.get(c));
		}
	}
}
