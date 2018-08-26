package com.codinginterview;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListCustom<E> extends ArrayList<E> {


	//arraylist want to allow duplicates or not ; if not it will give exception ; it is using Set to find out the duplication 
	public boolean allowDuplicates;

	public ArrayListCustom(boolean allowDuplicates)
	{
		this.allowDuplicates = allowDuplicates;
	}

	HashSet<Object> mySet = new HashSet<Object>();
	public boolean add(E e)
	{
		if (this.allowDuplicates == false && mySet.add(e) == false)
			throw new IllegalArgumentException("Duplicate values not allowed");

		else if (this.allowDuplicates == true && mySet.add(e) == false )
		{
			super.add(e);
		}
		return allowDuplicates;

	}

	public static void main(String[] args) {

		ArrayListCustom<String> myList = new ArrayListCustom<String>(false);
		myList.add("fan");
		myList.add("chair");
		myList.add("fan");
	}
}
