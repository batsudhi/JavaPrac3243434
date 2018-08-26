package BasicProg;

public class StringSwapping {

	
	public static void main(String[] args) {
	
	//WAP to swap strings without using temp variables
	
	String a = "Hello";
	String b = "World";
	
	System.out.println("before swapping");
	System.out.println("String a is "+a);
	System.out.println("String b is "+b);
	
	
//1. append a and b
a = a+b;
System.out.println(a);

// store initial string a in string b 
	
b = a.substring(0, a.length()-b.length());

System.out.println(b);
a= a.substring(b.length(), a.length());
System.out.println(a);
	
}
}