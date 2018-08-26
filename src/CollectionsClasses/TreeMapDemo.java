package CollectionsClasses;

import java.util.*;
import java.util.Map.Entry;
public class TreeMapDemo {

	public static void main(String args[]) {
		
		// Create a hash map - key is String and Value is in double
		TreeMap<String, Double> tm = new TreeMap<String, Double>();

		// Put elements to the map , adding pairs to map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));
		
		//Get a set of entries
		
		Set<Entry<String, Double>> set = tm.entrySet();
		
		// Get an iterator
		Iterator<Entry<String, Double>> it = set.iterator();
		
		
		//Display elements
		while(it.hasNext())
		{
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
System.out.println("");

// deposit 1000 in Ayan
	double balance = 	tm.get("Ayan").doubleValue();
			balance = balance + 1000;
			tm.put("Ayan", new Double(balance));
			System.out.println("Ayan's new balance is "+tm.get("Ayan"));
		
		
		
	}

}