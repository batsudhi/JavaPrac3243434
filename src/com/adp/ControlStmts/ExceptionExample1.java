package com.adp.ControlStmts;

public class ExceptionExample1 {
	
	public static void main(String[] args) {
		int a =0;
		int b = 20;
		try {
			int c = b/a;
			System.out.println("division output is  "+c);
		}catch(ArithmeticException e){
			System.out.println("didvide by zeo is wrong");
		}
		
		
	
	}


}
