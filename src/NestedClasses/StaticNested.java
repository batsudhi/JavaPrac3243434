package NestedClasses;

/*There are 2 types of Nested Classes.

Static Nested Classes
Non-Static Nested Classes or Inner Classes*/


//If nested class is declared as static, then that nested class is called as static nested class.


//Static nested classes can contain both static and non-static members.
public class StaticNested {
	
	int i;       //Field as a member

	void methodOne()
	{
		//method as a member
	}

	static class NestedClass
	{
		//class as a member which is declared as static
		static int i;
		int a;
		
	}
}