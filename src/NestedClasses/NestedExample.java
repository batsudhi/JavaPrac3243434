package NestedClasses;


//Below example shows how to refer Objects of the static nested class.

public class NestedExample {

	int i = 10;

	static void methodOne()
	{
		System.out.println("Static method of class");
	}

	static class NestedClassOne
	{
		int i = 20;

		static void methodOne()
		{
			System.out.println("Static method of NestedClassOne");
		}
	}	
	static class NestedClassTwo
	{
		int i = 30;

		static void methodOne()
		{
			System.out.println("Static method of NestedClassTwo");
		}
	}
}

//further implementtion in NestedClasses.class