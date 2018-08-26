package CollectionsClasses;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String a[]){
		HashSet<String> hs = new HashSet<String>();
		//add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		System.out.println("Is HashSet empty? "+hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		System.out.println("Size of the HashSet: "+hs.size());
		System.out.println("Does HashSet contains first element? "+hs.contains("first"));

		Iterator<String> it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//How to copy Set content to another HashSet?
		HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
        
        //How to copy all elements from HashSet to an array?
        System.out.println("HashSet content: ");
        System.out.println(hs);
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
        
        
        
        //How to compare two sets and retain elements which are same on both sets?
        
        HashSet<String> hs1 = new HashSet<String>();
		//add elements to HashSet
		hs1.add("one");
		hs1.add("two");
		hs1.add("three");
		System.out.println(hs1);
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("four");
		hs2.add("three");
		hs2.add("five");
		System.out.println(hs2);
		
		System.out.println(hs1.retainAll(hs2));
		System.out.println(hs1);
        
        
        
        
	}
}
