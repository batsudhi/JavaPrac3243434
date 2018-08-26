package com.adp.Collections;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> obj = new ArrayList<String> ();
		obj.add("Akhila");
		obj.add("Balu");
		obj.add("sonu");
		obj.add("Manasa");

		System.out.println("list is..."+obj);

		obj.remove("sonu");
		System.out.println("list is..."+obj);

		for(String str:obj) {
			System.out.println(str);
		}
		
		Set<String> s = new Set<String>();
		s.


	}
}