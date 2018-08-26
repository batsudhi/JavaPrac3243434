package arrayPrograms;

import java.util.Arrays;

public class PrintDistinctElements {

    // Driver program
    public static void main (String[] args) 
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDistinct(arr, n);
    }

	private static void printDistinct(int[] arr, int n) {
		
		Arrays.sort(arr);
		for (int i = 0; i<n; i++)
		{
			while (i<n-1 && arr[i] == arr[i+1])
				i++;
			System.out.println(arr[i]);
		}
	}
}