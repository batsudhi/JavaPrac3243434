package com.adp.javaTraining;

public class multilevelSubSub extends multilevelSub {
void methodC() {
	System.out.println("method called from subsub");
	
}
public static void main(String[] args) {
	multilevelSubSub obj = new multilevelSubSub();
	obj.methodA();
	obj.methodB();
	obj.methodC();
}
}
