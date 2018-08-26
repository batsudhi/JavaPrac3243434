package CollectionsClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main (String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("AL");
		al.add(10);
		al.add("AL");
		al.add(null);

		
		System.out.println(al);

		al.remove(2);

		System.out.println(al);

		al.add(2, "M");
		al.add("New");
		System.out.println(al);

		/**ArrayList and Vector have access/implementation of RandonAccess interface			

			so that they can access any random element with the same speed, be it 1st or 51 or 1001st or nth element in the AL or Vector			

			so if frequent operation is retrieval operation, ArrayList or vector are the best choice  			

			RandonAccess interface is in java.util and it do not have any methods, it is just marker interface	*/		



		/*		"Every collection class implements Serializable interface, so that it has the feature of transferring objects

			to transfer object from one place to another , It should be serializable object, 

			to provide this feature , all collection class implements Serializable"						



			"Using serialization when we transfer objects from one place /collection to another , then after reaching at the destination, 
			to avoid the data loss , it/the receiver will create duplicates of all those objects which is know as cloning"				

			Every collection class also implements Clonable interface, so to leverage cloning of objects	*/					

		ArrayList l1 = new ArrayList();
		LinkedList l2 =  new LinkedList();

		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);

		System.out.println(l2 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);

		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);

		// create an empty array list with an initial capacity
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		// use add() method to add elements in the list
		 arrlist.add(15);
	      arrlist.add(22);
	      arrlist.add(30);
	      arrlist.add(40);
	  	// let us print all the elements available in list
			for (Integer number : arrlist) {
				System.out.println("Number = " + number);
			}
			
		// adding element 25 at third position
	      arrlist.add(2,25);
		// let us print all the elements available in list
		for (Integer number1 : arrlist) {
			System.out.println("Number = " + number1);
		}
		
		 // inserting all elements, list2 will get printed after list1
		   //arrlist.addAll((Integer)al);
			
		   System.out.println("Printing all the elements");
		   // let us print all the elements available in list1
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }
		
		// create an empty array list2 with an initial capacity
		   ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
			
		   // use add() method to add elements in list2
		   arrlist2.add(45);
		   arrlist2.add(40);
		   arrlist2.add(41);
		   arrlist2.add(55);
		   arrlist2.add(45);
		   
		   // inserting all elements of list2 at third position
		   arrlist.addAll(3, arrlist2);
		   System.out.println("Printing all the elements");
		   // let us print all the elements available in list1
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }
		   
		// finding size of this list
		      int retval = arrlist.size();
		      System.out.println("List consists of "+ retval +" elements");
		      
		      
		   // list contains element 10
		      boolean retval1 = arrlist.contains(10); 
		        
		      if (retval1 == true) {
		         System.out.println("element 10 is contained in the list");
		      } else {
		         System.out.println("element 10 is not contained in the list");
		      }
		         
		      // list does not contain element 30
		      boolean retval2 = arrlist.contains(30);
		        
		      if (retval2 == true) {
		         System.out.println("element 30 is contained in the list");
		      } else {
		         System.out.println("element 30 is not contained in the list");    
		      }
		      
		   // this will increase the capacity of the ArrayList to 35 elements
		      arrlist.ensureCapacity(35);
		      
		      
		   // retrieves element at 4th postion
		      int thirdval =arrlist.get(3);
		      System.out.println("Retrieved element is = " + thirdval);	
		      
		   // retrieving the index of element "E"
		      int indexofval=arrlist.indexOf(45);
		      System.out.println("The element 45 is at index " + indexofval);
		      
		      System.out.println(arrlist.isEmpty());
		      
		   // Retrieving the index of last occurrence of element "E"
		      int lastretval45 = arrlist.lastIndexOf(45);
		      System.out.println("The last occurrence of 45 is at index " + lastretval45);
		      
		      
		     Iterator<Integer> it = arrlist.iterator();
		     while (it.hasNext())
		     {
		    	 System.out.println("printing values through iterator");
		    	 System.out.println(it.next());
		     }
		     
		     
		     for (Integer number : arrlist) {
				   System.out.println("Number = " + number);
				   }
		     //remove second index
		     arrlist.remove(1);
		     
		   //remove value
		     arrlist.remove((Object)25);		     
		     
		     System.out.println("after removing 2nd index and 25");
		     for (Integer number : arrlist) {
				   System.out.println("Number = " + number);
				   }
		     
		  // inserting elment 55 at 3rd position
		      arrlist.set(0,55);
		      System.out.println("The list after using removeRange:" + arrlist);
		      
		    
		      //toArray in same order
		      Object[] ob = arrlist.toArray();
		      System.out.println("Printing elements from first to last:"); 
		      for (Object value : ob) {
		         System.out.println("Number = " + value);
		      }
		     
		   // toArray copies content into other array
		      Integer list2[] = new Integer[arrlist.size()];
		      list2 = arrlist.toArray(list2);
		     
		      System.out.println("Printing elements of array2");

		      // let us print all the elements available in list
		      for (Integer number : list2) {
		         System.out.println("Number = " + number);
		      }
		     
	}
}
