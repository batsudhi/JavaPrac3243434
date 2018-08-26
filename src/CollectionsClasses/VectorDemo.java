package CollectionsClasses;

import java.util.Vector;

public class VectorDemo {

	

	   public static void main(String args[]) {
		   
		   Vector v = new Vector();
		   
		   System.out.println("vector capacity is "+v.capacity());
		   
		   for (int i =0; i<10;i++)
		   {
			   v.add((i+1));
			   
		   }
		   
		   System.out.println(v);
		   
		   v.addElement(11);
		   System.out.println(v);
		   
		   System.out.println("vector capacity is "+v.capacity());
		   
		   
   System.out.println("trying with initial  capacity constructor");
		   
		   
		   Vector v2 = new Vector(25);
		   
		   System.out.println("vector capacity is "+v2.capacity());
		   
		   for (int i =0; i<10;i++)
		   {
			   v2.add((i+1));
			   
		   }
		   
		   System.out.println(v2);
		   
		   v2.addElement(11);
		   System.out.println(v2);
		   System.out.println("vector capacity is "+v2.capacity());
		   
		   System.out.println("trying with incremental capacity constructor");
		   
		   
		   Vector v1 = new Vector(10, 2);
		   
		   System.out.println("vector capacity is "+v1.capacity());
		   
		   for (int i =0; i<10;i++)
		   {
			   v1.add((i+1));
			   
		   }
		   
		   System.out.println(v1);
		   
		   v1.addElement(11);
		   System.out.println(v1);
		   
		   System.out.println("vector capacity is "+v1.capacity());
		   
		   
	   }
}
