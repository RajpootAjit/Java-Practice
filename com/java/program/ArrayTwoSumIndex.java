package com.java.program;

import java.util.Arrays;

public class ArrayTwoSumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,5};
		int targetSum = 7;
		int[] indexNum = new int[2];
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == targetSum) {
					indexNum[0] = i;
					indexNum[1] = j;
					found = true;
					break;
				}
				
				
			}
			if(found == true) break;
			
			
		}
		if(found) {
			System.out.println("TargetSum : " + targetSum + " "+ Arrays.toString(indexNum));
			
		}
		else {
			System.out.println("not found");
		}

	}

}
