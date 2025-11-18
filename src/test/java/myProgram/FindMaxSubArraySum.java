package myProgram;

public class FindMaxSubArraySum {
	
	public static int maxSumSubArray(int arr[], int size) {
		
		int maxValue = Integer.MIN_VALUE;
		int currentRunningSum = 0;
		for(int i=0; i<arr.length; i++) {
			currentRunningSum += arr[i];
			if(i>=size-1) {
				maxValue = Math.max(maxValue, currentRunningSum);
				currentRunningSum -= arr[i-(size-1)];
				
			}
		}
		return maxValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxSumSubArray(new int[]{1,2,3,5,6,7,8}, 3));
		

	}

}
