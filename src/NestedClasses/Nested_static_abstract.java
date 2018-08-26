package NestedClasses;

public class Nested_static_abstract {

	
	//We have seen that static methods can’t be abstract but static nested classes can be abstract.
	
	//static and abstract inner class
		 
    abstract static class NestedClass
    {
        abstract void methodOne();  //abstract method of NestedClass
 
        void methodTwo()
        {
            //concrete method of NestedClass
        }
    }
}