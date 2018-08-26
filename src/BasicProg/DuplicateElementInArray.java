package BasicProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {

	 public static void main(String[] args) {

		 String names[] = {"Java", "JavScript","Ruby","C","Java", "C"};
		 
		 int arrayLength = names.length;
		 
		 //1. compare each element: O(nxn)  -  worst solution
		 for(int i= 0; i<arrayLength; i++)
		 {
			 for (int j=i+1; j<arrayLength; j++ )
			 {
				 if (names[i].equalsIgnoreCase(names[j]))
				 {
					 System.out.println("Duplicate Element is " +names[i]);
				 }
			 }
			 
		 }
		 
		 
		 //2. using hashset: JavaCollection: it stores unique values;  - O(n)
		 Set<String> store = new HashSet<String>();
		 for (String name: names){
			 if (store.add(name) == false)
			 System.out.println("Duplicate Element - "+name); 
			 }
		 
		 
		 
		 //3. using HashMap
		 
		 Map<String, Integer> storeMap =  new HashMap<String, Integer>();
		 
		 
		 //enter all elements in a Map 
		 for (String name: names)
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
				 System.out.println("Duplicate Item is  "+entry.getKey());
			 }
		 }
		 
		 
		 
	 }
}
