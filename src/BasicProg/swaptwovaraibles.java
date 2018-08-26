package BasicProg;

public class swaptwovaraibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//swapping two numbers without temp variable
		
		int x = 5;
		int y = 10;
		
		
		//Add solution
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		x= x+y; // - 15
		y = x-y;  // y = 5
		
		x= x-y; //  x = 5
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		
		// multiply solution
		
		x = 5;
		y = 10;
		
		
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		x = x*y;
		y = x/y;
		x= x/y;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		
		
		//XOR oprator
		
		x = 5;
		y = 10;

		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		x = x^y;
		y = x^y;
		x = x^y;
		

		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		
	
		
	}

}