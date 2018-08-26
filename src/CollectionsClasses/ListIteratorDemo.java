package CollectionsClasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		
		 LinkedList ll = new LinkedList ();
	      
	      // add elements to the linked list
	      ll.add("ravi");
	      ll.add("surya");
	      ll.add("vamsi");
	      ll.add("karan");

	      System.out.println(ll);
	      
	      ListIterator ltr = ll.listIterator();
	      
	      while(ltr.hasNext())
	      {
	    	  	String s = (String)ltr.next();
	    	  	if (s.equalsIgnoreCase("VamSi"))
	    	  	{
	    	  		ltr.remove();
	    	  		System.out.println("Removed Vamsi");
	    	  	}
	    	  	
	    	  	if(s.equalsIgnoreCase("Karan"))
	    	  	{
	    	  		ltr.set("lasya");
	    	  		System.out.println("Replaced Karan with Lasya");
	    	  	}
	    	  
	    	  	
	    	  	if (s.equalsIgnoreCase("Surya"))
	    	  	{
	    	  		ltr.add("Shashi");
	    	  		System.out.println("Added Shashi after Surya");
	    	  	}
	      
	      }
	      
	      System.out.println(ll);
	      
	      //Java ListIterator Sample Code
	      List<Integer> li = new ArrayList<Integer>();
	        ListIterator<Integer> litr = null;
	        li.add(23);
	        li.add(98);
	        li.add(29);
	        li.add(71);
	        li.add(5);
	        litr=li.listIterator();
	        System.out.println("Elements in forward directiton");
	        while(litr.hasNext()){
	            System.out.println(litr.next());
	        }
	        System.out.println("Elements in backward directiton");
	        while(litr.hasPrevious()){
	            System.out.println(litr.previous());
	        }
		
	}
	
}
