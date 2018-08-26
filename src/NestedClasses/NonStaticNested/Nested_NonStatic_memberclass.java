package NestedClasses.NonStaticNested;

public class Nested_NonStatic_memberclass {

	/*
		 * Non-Static Nested Classes In Java :
		 * Nested classes which are declared as non-static or nested classes which can be accessed only though instantiating 
		it’s outer class are called non-static nested classes. Non-static nested classes are also called as Inner Classes.

		They are 3 types of Inner Classes in java.

		Member Inner Classes
		Local Inner Classes
		Anonymous Inner classes
		Today we will discuss about Member Inner Classes.*/
	
		/*Member Inner Classes :

		Member Inner Classes are non-static nested classes which are declared as non-static members of outer class.

		Let’s discuss important observations about member inner classes.

		Member inner classes must contain only non-static members. Static members are not allowed inside member inner classes.*/
	
	
		//inner class non static 
	class InnerClass
	{
		int i = 10;
		static int j = 11;
		
		//But, here is the interesting point. You can declare a static field inside a member inner class 
		//if the field is final. And such field must be initialized at the time of declaration only. 
		//Remember, this rule is only for the fields not for the methods.
		
		static final int k =10;
		
		public void methodone()
		{
			//can have non static method 
		}
		
		public static void methodtwo()
		{
			//can't have static method
		}
		
		// can have any number of instance blocks ; should not have any static instance blocks - SIB
		
		{
			System.out.println("First IIB");
		}
		
		{
			System.out.println("Second IIB");
		}
		
		static
		{
			//compile time error
		}
		
	}
		
}
