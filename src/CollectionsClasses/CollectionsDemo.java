package CollectionsClasses;

import java.util.*;

public class CollectionsDemo {

   public static void main(String[] args) {
    
	   // ArrayList 
      List<String> a1 = new ArrayList<String>();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      // LinkedList
      List<String> l1 = new LinkedList<String>();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set<String> s1 = new HashSet<String>(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map<String, Integer> m1 = new HashMap<String,Integer>(); 
      m1.put("Zara", 8);
      m1.put("Mahnaz", 31);
      m1.put("Ayan", 12);
      m1.put("Daisy", 14);
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      System.out.println("\t" + m1.get("Zara"));
      
      
      
   // create two lists    
      List<String> srclst = new ArrayList<String>(5);
      List<String> destlst = new ArrayList<String>(10);

      // populate two lists
      srclst.add("Java");
      srclst.add("is");
      srclst.add("best");

      destlst.add("C++");
      destlst.add("is");
      destlst.add("older");

      // copy into dest list
      Collections.copy(destlst, srclst);            

      System.out.println("Value of source list: "+srclst);
      System.out.println("Value of destination list: "+destlst);
      
      
      //Program: How to add all elements to the given collection object?
      List<String> myList = new ArrayList<String>();
      myList.add("java");
      myList.add("c");
      myList.add("c++");
      System.out.println("Initial list:"+myList);
      Collections.addAll(myList, "perl","php");
      System.out.println("After adding elements:"+myList);
      //adding array objects to collection
      String[] strArr = {".Net", "unix"};
      Collections.addAll(myList, strArr);
      System.out.println("After adding array:"+myList);
      
   }
}