package com.adp.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adp.Collections.Student1;

public class Impl {

	public static void main(String[] args) {
		Student1 std = new Student1(101, "Akhila");
		Student1 std2 = new Student1(102, "Balu");
		Student1 std3 = new Student1(103, "Sonu");
		
		List<Student1> al = new ArrayList<Student1>();
		
		al.add(std);
		al.add(std2);
		al.add(std3);
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student1 stdobj = (Student1) itr.next(); //typecasting to student1 type obj
			//.next will return current item
			System.out.println(stdobj.rollNO+"" +stdobj.name);
			
		}
		
	}
}