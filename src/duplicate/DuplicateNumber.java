package duplicate;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	//Find out duplicate number between 1 to N numbers
	
/*	Description:
		You have got a range of numbers between 1 to N, where one of the number is
		repeated. You need to write a program to find out the duplicate number.*/
	
	public int findDuplicateNumber( List<Integer> num)
	{
		int length =  num.size();
		int total = getSumOflist(num);
		return total - (length*(length-1)/2);
		
	}
	
	 private int getSumOflist(List<Integer> num) {
		int sum = 0;
		 for(int n : num )
		 {
			 sum += n;  
		 }
		return sum;
	}

	public static void main(String a[]){
	        List<Integer> numbers = new ArrayList<Integer>();
	     
	        for(int i=1;i<30;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(25);
	        DuplicateNumber dn = new DuplicateNumber();
	        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	    }

}
