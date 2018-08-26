package arrayPractice.MaxSumSubArray;

public class MaximumSubArraySum2 {
	
	// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	//time complexity = O(n square)
	 int Maximum_Sum_Subarray(int arr[], int n)
	{
		int ans =Integer.MIN_VALUE;
		
		for (int start_index = 0; start_index<=n; start_index++ )
		{
			int sum = 0;
			for (int subArraySize=1;subArraySize <=n; subArraySize++)
			{
				if((subArraySize+start_index)>n)
					break;
				
				sum+=arr[start_index+subArraySize-1];
				ans = Math.max(sum, ans);
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		MaximumSubArraySum2 mn = new MaximumSubArraySum2();
		int[] arr = {-1,-5,-10,10,-20,10,5,-4,6};
		int maxSumTotal = mn.Maximum_Sum_Subarray(arr, arr.length);
		System.out.println("max sum sub array = "+maxSumTotal);
	}
	

}
