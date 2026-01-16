package practice_Optum;

import java.util.Arrays;

public class AddIndexPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,34,22,43,22};
		int target = 44;
		int[] num = new int[2];
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					num[0] = i;
					num[1] = j;
					found = true;
					break;
					
				}
			}
			if(found) break;
		}
		
		if(found) {
			System.out.println("pair found "+target + " "+ Arrays.toString(num) );
		}
		else {
			System.out.println("no pair found");
		}

	}

}
