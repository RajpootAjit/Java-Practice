package myProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
		boolean found = true;
		if(num<=2) {
			System.out.println(num+ " is prime number");
			return;
		}
		
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime number");
				found = false;
				break;
			}
		}
		if(found) {
			System.out.println(num + " is prime number");
		}

	}

}
