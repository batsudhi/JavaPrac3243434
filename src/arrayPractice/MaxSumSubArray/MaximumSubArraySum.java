package arrayPractice.MaxSumSubArray;

public class MaximumSubArraySum {
	
	//time complexity = O(n cube)
	 int Maximum_Sum_Subarray(int arr[], int n)
	{
		int ans =Integer.MIN_VALUE;
		for (int subArraySize = 1; subArraySize<=n; subArraySize++ )
		{
			for (int start_index=0;start_index<n; start_index++)
			{
				if(start_index+subArraySize>n)
					break;
				int sum =0;
				for (int i=start_index; i<(start_index+subArraySize); i++)
				{
					sum+=arr[i];
				}
				ans = Math.max(sum, ans);
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		MaximumSubArraySum mn = new MaximumSubArraySum();
		int[] arr = {-1,-5,-10,10,-20,10,5,-4,6};
		int maxSumTotal = mn.Maximum_Sum_Subarray(arr, arr.length);
		System.out.println("max sum sub array = "+maxSumTotal);
	}
	

}
