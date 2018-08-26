package arrayPrograms;

import java.util.HashSet;

public class PrintDistinctElementsHashing {

    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printDistinct(arr);
    }

	private static void printDistinct(int[] arr) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<=arr.length; i++)
		{
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				System.out.println(arr[i]);
			}
		}
		
	}
}
