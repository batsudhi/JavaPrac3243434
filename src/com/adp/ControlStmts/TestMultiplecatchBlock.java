package com.adp.ControlStmts;

public class TestMultiplecatchBlock {
	
	public static void main(String[] args) {
		try{  
		    int a[]=new int[5];  
		    a[6]=30/0;  
		   }  
		    
		   catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("task 2 completed");
		   }
		catch(ArithmeticException e){
			System.out.println("task1 is completed");
			} 
		   finally{
			   System.out.println("common task completed");//common exception, covers all
		   }  
		  
		   System.out.println("rest of the code..."); 
		   
		 } 
	}




