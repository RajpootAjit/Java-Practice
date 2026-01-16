package practice_Optum;

public class Two_array_sum {
	
	public static boolean findSum(int[]arr,int target) {
		boolean found = false;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("pair found at indices "+ i + " "+ j);
					System.out.println("value of "+ arr[i]+ " + "+ arr[j]+ " "+ " = "+ target);
					found = true;
					break;
					
				}
				
				
			}
			if(found) break;
			
			
		}
		return found;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int target = 3;
		// TODO Auto-generated method stub
		System.out.println(findSum(arr,target));

	}

}
