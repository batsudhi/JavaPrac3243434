package NestedClasses;

public class NestedStatic2 {

	//We can access only static members of outer class inside a static nested class. 
	//We can’t access non-static members of outer class inside a static nested class.
	
	static int i;  //static field of OuterClass
    int j;         //Non-static field of OuterClass
 
    void methodOne()
    {
        //Non-static method of OuterClass
    }
 
    static void methodTwo()
    {
        //static method of OuterClass
    }
 
    static class NestedClass
    {
        void methodOfInnerClass()
        {
            System.out.println(i);    //static field can be accessed
 
            System.out.println(j);    //This gives Compile time error coz it's non static of outer class
 
            //can't access non-static field
 
            methodTwo();   //can access static method
 
            methodOne();   //This gives Compile time error
 
            //can't access non-static method
        }
    }
}