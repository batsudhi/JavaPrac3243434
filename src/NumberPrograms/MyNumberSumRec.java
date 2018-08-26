package NumberPrograms;

public class MyNumberSumRec {
	
	int sum = 0;
	private int getNumberSum(int num) {
			if (num ==0) {
				return sum;}
			else 
			{ 	sum = sum + (num%10);
				getNumberSum(num/10);
			}
			return sum;
	}
	
	 public static void main(String a[]){
	        MyNumberSumRec mns = new MyNumberSumRec();
	        System.out.println("Sum is: "+mns.getNumberSum(2232));
	    }
}
