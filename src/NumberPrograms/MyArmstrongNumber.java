package NumberPrograms;

public class MyArmstrongNumber {

	
	//Program: Write a program to find the given number is Armstrong number or not?
	
/*	Description:
		Armstrong numbers are the sum of their own digits to the power of
		the number of digits. It is also known as narcissistic numbers.*/
	
	private boolean isArmstrongNumber(int num) {
		
		int tmp = num;
		int sum = 0;
		int numLength = String.valueOf(num).length();
		int div;
		
		while (tmp >0)
		{
			div = tmp %10;
			int temp =1;
			for (int i=0; i<numLength;i++)
			{
				temp*= div;
			}
			sum += temp;
			temp/= 10;
		}
		
		if (tmp ==num)
		{
			return true;
		}
		
		
		return false;
	}
	
    public static void main(String a[]){
        MyArmstrongNumber man = new MyArmstrongNumber();
        System.out.println("Is 371 Armstrong number? "+man.isArmstrongNumber(371));
        System.out.println("Is 523 Armstrong number? "+man.isArmstrongNumber(523));
        System.out.println("Is 153 Armstrong number? "+man.isArmstrongNumber(153));
    }
}
