package NestedClasses;

public class InnerClassInheritance {

	class InnerClassOne
	{
		int x = 10;

		void methodOfInnerClassOne()
		{
			System.out.println("From InnerClassOne");
		}
	}

	class InnerClassTwo extends InnerClassOne
	{
		//One Inner Class can extend another inner class
	}
}