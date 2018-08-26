package com.codinginterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class checkforDup {
	
	public static void main(String[] args) {
		int[] aj = {1,4,3,6,2,3,5,4,3};
		//checkForDupli(aj);
		
		checkForDupliUsingSet(aj);
	}
	
	//nested approach
	public static void checkForDupli(int arr[])
	{
		Arrays.sort(arr);
		int size = arr.length;
		for (int i= 0; i< size-1; i++)
		{
			for (int j=i+1; j<size; j++)
			{
				if (arr[i] == arr[j] && i!=j)
				{
					System.out.println("Duplicate exist - "+arr[i]);
					break;
				}
			}
		}
	}
	
	public static void checkForDupliUsingSet(int arr[])
	{
		Set<Integer> set = new HashSet<Integer>();
		for(int a: arr)
		{
			if (!set.add(a))
			{
				System.out.println("Duplicate Value is "+a);
			}
		}
		
	}
}
