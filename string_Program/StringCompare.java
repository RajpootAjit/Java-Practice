package string_Program;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ajit";
		String str2 = "tija";
		
		char [] ch1 = str1.toCharArray();
		char []	ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);
		
		if(result == true) {
			System.out.println("string are anagram");
		}
		else {
			System.out.println("string are not anagram");
		}

	}

}
