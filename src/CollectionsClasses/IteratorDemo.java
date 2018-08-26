package CollectionsClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {


		ArrayList l = new ArrayList();

		for (int i=0; i<=10; i++)
		{
			l.add(i);
		}

		System.out.println(l);

		Iterator it = l.iterator();

		while(it.hasNext())
		{
			Integer in = (Integer)it.next();
			if(in%2 ==0)
				System.out.println(in);
			else
				it.remove();
		}

		System.out.println(l);

//Program: How to iterate through collection objects?
		//Description:
		/*You can iterate through any collection object by using Iterator object. 
		It provides two methods to iterate. The hasNext() method returns 
		true if the iteration has more elements. 
		The next() method returns the next element in the iteration.
		Below example shows how to iterate through an ArrayList.*/
		
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Unix");
		myList.add("Oracle");
		myList.add("C++");
		myList.add("Perl");
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//How to remove an element from collection using Iterator object?
		String removeElem = "Perl";
		Iterator<String> itr1 = myList.iterator();
		while(itr1.hasNext()){
            if(removeElem.equals(itr1.next())){
                itr1.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
		
		
		
	}
}
