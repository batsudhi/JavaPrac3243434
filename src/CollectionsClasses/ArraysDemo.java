package CollectionsClasses;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	 public static void main (String args[]) {

	      // create an array of strings
	      String a[] = new String[]{"abc","klm","xyz","pqr"};

	      List list1 = Arrays.asList(a);

	      // printing the list
	      System.out.println("The list is:" + list1);
	      
	      
	      
	   // initializing unsorted char array
	      char cArr[] = {'r','q','s','p'};

	      // let us print all the values available in list
	      for (char value : cArr) {
	         System.out.println("Value = " + value);
	      }

	      // sorting array
	      Arrays.sort(cArr);

	      // let us print all the values available in list
	      System.out.println("The sorted char array is:");
	      for (char number : cArr) {
	         System.out.println("Number = " + number);
	      }
	      
	      
	   // initializing char array
	      char[] c1 = new char[] { 'd', 'e', 'f' };

	      // let us print all the values available in list
	      System.out.println("The array is:");
	      for (char value : c1) {
	         System.out.println("Value = " + value);
	      }
	      
	      System.out.println("The string representation of array is:");
	      System.out.println(Arrays.toString(c1));    
	      
	      
	      
	      
	   }
	 
	 
	 
}
