package NumberPrograms;

public class TwoMaxNumbers {

//	Program: Write a program to find top two maximum numbers in a array
	
	/*Description:
		Write a program to find top two maximum numbers in the
		given array. You should not use any sorting functions. You
		should iterate the array only once. You should not use any
		kind of collections in java.*/
	
	public static void main(String a[]){
		int num[] = {5,34,78,2,45,1,99,23};
		TwoMaxNumbers tmn = new TwoMaxNumbers();
		tmn.printTwoMaxNumbers(num);
	}

	private void printTwoMaxNumbers(int[] num) {

		int maxOne = 0;
		int maxTwo = 0;

		for (int n : num)
		{
			if (maxOne< n)
			{
				maxTwo = maxOne;
				maxOne = n;
			}
			else if (maxTwo <n)
			{ 
				maxTwo =n;
			}
		}
		System.out.println("Max one " +maxOne);
		System.out.println("Max two " +maxTwo);
	}
}
