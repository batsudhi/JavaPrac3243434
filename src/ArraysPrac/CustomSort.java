package ArraysPrac;

import java.util.Arrays;

public class CustomSort {

	public static void bubbleSort(Integer[] arr)
	{
		int j = 0;
		Integer temp;
		boolean sorted = false;

		while(!sorted)
		{
			sorted = true;
			j++;

			for (int i=0; i< arr.length-j; i++)
			{
				if(arr[i].compareTo(arr[i+1]) > 0)
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Integer[] myArray = {5,3,7,1,2,6,9	};
		bubbleSort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
}
