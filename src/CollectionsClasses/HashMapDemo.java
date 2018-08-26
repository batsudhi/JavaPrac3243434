package CollectionsClasses;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {public static void main(String args[]) {
   
    
    
    HashMap<String, String> hm  = new HashMap<String, String>();
    
    hm.put("first", "FIRST INSERTED");
    hm.put("second", "SECOND INSERTED");
    hm.put("third","THIRD INSERTED");
    System.out.println(hm);
    
  //getting value for the given key from hashmap
    System.out.println("Value of second: "+hm.get("second"));
    
    System.out.println("Is HashMap empty? "+hm.isEmpty());
    
    hm.remove("third");
    System.out.println(hm);
    
    System.out.println("Size of the HashMap: "+hm.size());
    
    
    Set<String> keys = hm.keySet();
    
    for(String key: keys){
        System.out.println("Value of "+key+" is: "+hm.get(key));
    }
    
    
    //copy one map to another
    HashMap<String, String> subMap = new HashMap<String, String>();
    subMap.put("s1", "S1 VALUE");
    subMap.put("s2", "S2 VALUE");
    hm.putAll(subMap);
    System.out.println(hm);
    
    //How to search a key in HashMap
    
    if(hm.containsKey("first")){
        System.out.println("The hashmap contains key first");
    } else {
        System.out.println("The hashmap does not contains key first");
    }
    
    //How to search a value in HashMap?
    if(hm.containsValue("SECOND INSERTED")){
        System.out.println("The hashmap contains value SECOND INSERTED");
    } else {
        System.out.println("The hashmap does not contains value SECOND INSERTED");
    }
    
  //getting value for the given key from hashmap
    Set<Entry<String, String>> entires = hm.entrySet();
    for(Entry<String,String> ent:entires){
        System.out.println(ent.getKey()+" ==> "+ent.getValue());
    }
    
    //How to delete all elements from HashMap?
    //System.out.println("Clearing HashMap:");
    //hm.clear();
    
    
    
    
    
    // Create a hash map
    HashMap<String, Double> hmm = new HashMap<String, Double>();

    // Put elements to the map
    hmm.put("Zara", 3434.34);
    hmm.put("Mahnaz", new Double(123.22));
    hmm.put("Ayan", new Double(1378.00));
    hmm.put("Daisy", new Double(99.22));
    hmm.put("Qadir", new Double(-19.08));
    
    // Get a set of the entries
    Set<Entry<String, Double>> set = hmm.entrySet();
    
    // Get an iterator
    Iterator<Entry<String,Double>> it = set.iterator();
   
    // Display elements 
    while(it.hasNext()) {
       Map.Entry<String, Double> me = (Map.Entry<String, Double>)it.next();
       System.out.print(me.getKey() + ": ");
       System.out.println(me.getValue());
    }
    System.out.println();
   
    // Deposit 1000 into Zara's account
    double balance = ((Double)hmm.get("Zara")).doubleValue();
    hmm.put("Zara", new Double(balance + 1000));
    System.out.println("Zara's new balance: " + hmm.get("Zara"));
    
    
    
 }
}