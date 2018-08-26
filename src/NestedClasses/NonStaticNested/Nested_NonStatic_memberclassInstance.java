package NestedClasses.NonStaticNested;

public class Nested_NonStatic_memberclassInstance {

	public static void main(String[] args) {
		
		Nested_NonStatic_memberclass1  ins = new Nested_NonStatic_memberclass1();
		
		Nested_NonStatic_memberclass1.innerClass insInner = ins.new innerClass();  //creating an instance of InnerClass
		
		System.out.println(ins.i);
		
		System.out.println(insInner.k);
		
		insInner.methodinner();
		
	
	}
}

