package CollectionsClasses;

import java.util.Stack;

public class StackDemo {

	   public static void main(String args[]) {
		   
		   Stack s = new Stack();
		   
		   s.push("A1");
		   s.push("B2");
		   s.push(3);
		   s.push(null);	   
		   
		   System.out.println(s);
		   
		   System.out.println("search for 3 is "+s.search(3));
		   System.out.println("search for B =  "+s.search("B"));
		   
		   System.out.println("size of this stack is "+(s.size()));
	   
	   }

}
