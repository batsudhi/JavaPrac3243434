package com.adp.javaTraining;

public class SubClass extends SuperExample {
	int num = 10;
	void display() {
		System.out.println("num is "+num);
	}
	void sub_method() {
		SubClass obj = new SubClass();
		obj.display();
		super.display();
		System.out.println("printing value of sub class variable.."+num);
		System.out.println("printing value of super class variable.."+super.num);
	}
	
	
		public static void main(String args[]) {
			SubClass subObj = new SubClass();
			subObj.sub_method();

		}

	}


