package CollectionsClasses;

import java.util.*;

public class SetDemo {

	  public static void main(String args[]) {
	      int count[] = {34, 22,10,60,30,22};
	      int size = count.length;
	      
	      System.out.println("size - "+size);
	      
	      Set<Integer> set = new HashSet<Integer>();
	      try {
	         for(int i = 0; i < size; i++) {
	            set.add(count[i]);
	         }
	         System.out.println("Printing the set");
	         System.out.println(set);

	         System.out.println("\nSorting the set through treeSet");
	         TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedSet);

	         System.out.println("\nThe First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("\nThe last element of the set is: "+ (Integer)sortedSet.last());
	         
	      }
	      catch(Exception e) {}
	   }
	}