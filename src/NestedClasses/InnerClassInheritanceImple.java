package NestedClasses;

import NestedClasses.InnerClassInheritance;

public class InnerClassInheritanceImple {

	public static void main(String args[])
	{
		InnerClassInheritance outer = new InnerClassInheritance();   //Instantiating OuterClass

		InnerClassInheritance.InnerClassTwo innerTwo = outer.new InnerClassTwo();  //Instantiating InnerClassTwo

		System.out.println(innerTwo.x);    //Accessing inherited field x from InnerClassOne
		
		innerTwo.methodOfInnerClassOne();  //calling inherited method from InnerClassOne
	}
}
