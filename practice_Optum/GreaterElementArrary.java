package practice_Optum;

public class GreaterElementArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,10,4,7,3,4,6,8};
		int maxEle = arr[0];
		int minEle = arr[0];
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>maxEle) {
				maxEle = arr[i];
			}
			else if(arr[i]<minEle) {
				minEle = arr[i];
			}
		}
		System.err.println(maxEle);
		System.out.println(minEle);

	}

}
