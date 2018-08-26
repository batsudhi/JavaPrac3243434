package arrayPrograms;

public class MyDisticntElements {

	private static void printDistinctElements(int[] nums) {
		
		int len = nums.length;
		
		for (int i=0; i<len ; i++)
		{
			int j;
			for (j =0; j<i; j++)
			{
				if (nums[j] == nums[i])
				break; 
			}
			if(i==j)
			System.out.println(nums[i]);
			
		}
	}
	
	
	 public static void main(String a[]){
         
	        int[] nums = {5,2,7,2,4,7,8,2,3};
	        MyDisticntElements.printDistinctElements(nums);
	    }


}
