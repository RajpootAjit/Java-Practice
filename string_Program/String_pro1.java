package string_Program;

public class String_pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "ajit";
		String y = "amit";
		String a = "100";
		String b = "100";
		
		// compareTo function checks three things
		// if x > y then it will return +value
		// if x < y then it will return -ve value
		// if x == y then it will return zero
		
		if(x.compareTo(y) == 0) {
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		if(a.compareTo(b) == 0) {
			System.out.println("a is equal to b");
			
		}
		else {
			System.out.println("a is lower than b");
		}
		
		if(a.equals(b)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("string are not equal");
		}

	}
	

}
