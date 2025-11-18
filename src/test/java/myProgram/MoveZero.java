package myProgram;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,2,0,3,0,5,6,9};
		int newArr[] = new int[arr.length];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				newArr[index] = arr[i];
				index++;
			}
		
		}
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i]!=0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		
			System.out.print(Arrays.toString(newArr));
		

	}

}
