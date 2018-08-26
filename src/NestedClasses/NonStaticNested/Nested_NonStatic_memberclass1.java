package NestedClasses.NonStaticNested;

public class Nested_NonStatic_memberclass1 {

	//We can access both static and non-static members of outer class inside a member inner class.
	
	int i = 10;     //Non-static field of OuterClass
	 
    static int j = 20;    //Static field of OuterClass
 
    void methodOne()
    {
        System.out.println("Non-Static Method Of OuterClass");
    }
 
    static void methodTwo()
    {
        System.out.println("Static Method Of OuterClass");
    }
    
    
    
    class innerClass
    {
    	static final int k = 20;
    	
    	void methodinner()
    	{
    		System.out.println(i);
    		
    		System.out.println(j);
    		
    		methodOne();
    		
    		methodTwo();
    	}
    }
	
	
}
