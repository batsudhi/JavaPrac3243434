package arrayPrograms;

public class FindMiddleIndex {

	//Program: Find out middle index where sum of both ends are equal.
	
	/*Description:
		You are given an array of numbers. Find out the array index or position
		where sum of numbers preceeding the index is equals to sum of numbers
		succeeding the index*/
		
	 public static void main(String a[]) 
	 {
	        int[] num = { 1, 1, 1, 1, 1, 1 };
	        try {
	            System.out.println("Starting from index 0, adding numbers till index "
	                            + findMiddleIndex(num) + " and");
	            System.out.println("adding rest of the numbers can be equal");
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	 }

	private static int findMiddleIndex(int[] num) throws Exception {
		int maxindex = num.length -1 ;
		int startindex=0;
		int sumOfLeftArray = 0;
		int sumOfRightArray =0;
		
		
		while (true)
		{
			if (sumOfLeftArray < sumOfRightArray)
			{
				sumOfLeftArray+= sumOfLeftArray+ num[startindex++];
			}
			
			else if (sumOfLeftArray > sumOfRightArray) {
				{
					sumOfRightArray+= sumOfRightArray+ num[maxindex--];
				}
			}
			if (startindex > maxindex)
			{
				if (sumOfLeftArray == sumOfRightArray)
					{	
						break;
					}
				else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
			}
		}
		return maxindex;
	}
}
