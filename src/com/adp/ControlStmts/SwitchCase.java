package com.adp.ControlStmts;

import java.util.Scanner;

public class SwitchCase {
	public static void GetMonthname(int num) {
		switch (num){
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		default:
			System.out.println("the month falls in other quarters than 1st");
			break;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		GetMonthname(sc.nextInt());
	}
	
	
}
