package NestedClasses;

public class NestedinNested {
	
	//Static Nested Classes can be chained. i.e Nested class may contain another nested class and that nested class may
	//contain another nested class and so on.
	

	 static class NestedClass
	    {
	        static class NestedClassOne
	        {
	            static class NestedClassTwo
	            {
	                static class NestedclassThree
	                {
	                    static void methodOne()
	                    {
	                        System.out.println("Chain Of Nested Classes");
	                    }
	                }
	            }
	        }
	    }
	}