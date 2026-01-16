package practice_Optum;

import java.util.Scanner;

public class PrimeNumber {
 
	public static boolean isPrimeNum(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		
		
		if(isPrimeNum(num)) {
			System.out.println(num + " "+ " is a prime number ");
		}else {
			System.out.println(num + " "+ " is not a prime number ");
		}
		

	}

}
