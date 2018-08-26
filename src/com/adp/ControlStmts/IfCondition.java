package com.adp.ControlStmts;

import java.util.Scanner;

public class IfCondition {

	public static void TopicTrainer(String Level) {
		if( Level.equalsIgnoreCase("Easy"))
			System.out.println("Trainer is Anil");
		else
			System.out.println("Trainer is Mahesh");
	
	}
	
	public static String EvenOrOdd(int var) {
		String Type = null;
		if(var/2 == 0)
			Type = "Even";
		
		else if(var/2!=0)
			Type = "Odd";
		
		return Type;
	}
	
	
	public static String AssociateID(String Name) {
		String ID = null;
		if (Name.equals("Akhila"))
			ID = "268193";
		else if(Name.equals("Surya"))
			ID = "278567";
		else
			ID = "NA";
		return ID;
		
		}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		TopicTrainer(sc.next());
		System.out.println(EvenOrOdd(sc.nextInt()));
		System.out.println(AssociateID("Akhila"));
	}
}






