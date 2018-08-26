package javaGenerics;

public class TestGenerics4 {


	public static <E> void printArray(E[] elements)
	{
		for (E element: elements)
		{
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] intarry= {10,20,30,55,68};
		Character[] charArray= {'d','e','f','q','l','j'};
		
		System.out.println("Printing integer array");
		printArray(intarry);
		
		System.out.println("Printing character array");
		printArray(charArray);
	}

}
