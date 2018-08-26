package BasicProg;

import java.util.Arrays;

public class largestandSmallestNumberinArray {

	 public static void main(String[] args) {
	 
		 
		 int number[] = {-10,24,54,5,3,3255,154,87,-6,0};
		 
		 int largest = number[0];
		 
		 int smallest = number[0];
		 
		 //time complexity O[n]
		 for (int i= 1; i < number.length; i++)
		 {
			 if (number[i] > largest)
			 {
				 largest = number[i];
			 }
			 else if (number[i]<smallest)
			 {
				 smallest = number[i];
			 }
		 }
		 
		 System.out.println("Elements of array is "+Arrays.toString(number));
		 System.out.println("largest number is "+largest);
		 System.out.println("largest number is "+smallest);
	 
	 }
	
}
