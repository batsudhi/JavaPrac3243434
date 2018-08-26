package BasicProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateWords {
	public static void main(String[] args) {

		String str = "Sudhir is a very very good boy";

		String[] strArr = str.split(" ");

		System.out.println(str);

		printDupWords(strArr);

	}

	public static void printDupWords(String[] arr) {

		Map<String, Integer> storeMap =  new HashMap<String, Integer>();

		//enter all elements in a Map 
		for (String name: arr)
		{
			Integer count = storeMap.get(name);
			if (count == null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}

		// get the values of hashMap , we will use entry set  - O(2n)

		Set<Entry<String, Integer>> entrySet  = storeMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet )
		{
			if ( entry.getValue()  > 1 )
			{
				System.out.println("Duplicate Item is  "+entry.getKey()+" - "+entry.getValue());
			}
		}
	}
}