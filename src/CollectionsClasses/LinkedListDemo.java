package CollectionsClasses;

import java.util.*;
public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList ll = new LinkedList ();
      
      // add elements to the linked list
      ll.add("F");
      ll.add(1);
      ll.add("D");
      ll.add("23u");
      ll.add("u");
      ll.add("E");
      ll.add("D");
      ll.add(null);
      System.out.println(ll);
      
      //overwriting the 4th element using set 
      ll.set(3, "3rd");
      System.out.println("after setting element at 3rd");
      System.out.println(ll);
      
      //adding an element at the end
      System.out.println("after add last");
      ll.addLast("Z");
      System.out.println(ll);
      
    //adding an element at the start
      System.out.println("after add first ");
      ll.addFirst("A");
      System.out.println(ll);
      ll.add(1, "A2");
      System.out.println(ll);
      
      System.out.println("\nOriginal contents of ll: " + ll);

      // remove elements from the linked list
      
      System.out.println("after removing few elements - f and 3rd index");
      ll.remove("F");
      ll.remove(3);
      System.out.println("Contents of ll after deletion: " + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("ll after deleting first and last: " + ll);

      // get and set a value
      Object val = ll.get(2);
      ll.set(2, (String) val + " Changed");
      System.out.println("ll after change: " + ll);
   }
}
