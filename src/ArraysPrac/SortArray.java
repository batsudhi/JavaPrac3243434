package ArraysPrac;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int[] myArray = {9,4,2,8,3,7};
		Arrays.sort(myArray, 0, 2);
		//Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		
	}

}
