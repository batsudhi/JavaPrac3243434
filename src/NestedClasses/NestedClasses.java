package NestedClasses;

public class NestedClasses {
	
	public static void main(String[] args) {
		
		NestedExample.methodOne(); // static member can be accessed directly through class name.
		
		NestedExample ns = new NestedExample();
		System.out.println(ns.i);
		
		NestedExample.NestedClassOne.methodOne();
		NestedExample.NestedClassOne nc1 = new NestedExample.NestedClassOne();
		System.out.println(nc1.i);
		
		NestedExample.NestedClassTwo.methodOne();
		NestedExample.NestedClassTwo nc2 = new NestedExample.NestedClassTwo();
		System.out.println(nc2.i);
		
	}

}
