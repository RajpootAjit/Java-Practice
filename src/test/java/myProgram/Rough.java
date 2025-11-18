package myProgram;

import java.util.Arrays;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		System.out.println(arr.length);
		// output should be 1,2,3,4
		int newArr[] = new int[arr.length];
		int index = 0;
		//System.out.println(arr[arr.length]+1);
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length-1) {
				newArr[index] = arr[i]+1;
			}
			else {
				newArr[index] = arr[i];
				index++;
			}
			
		}
		
//		for(int i=index; i<newArr.length; i++) {
//			newArr[index] = arr[arr.length-1]+1;
//		}
		System.out.println(Arrays.toString(newArr));
		

	}

}
