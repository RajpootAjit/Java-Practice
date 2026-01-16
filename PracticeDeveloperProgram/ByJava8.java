package PracticeDeveloperProgram;

import java.util.Arrays;

public class ByJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ajit kumar singh";
		String reversedString = reversedCapitalFirstLetter(input);
		System.out.println(reversedString);

	}
	
	public static String reversedCapitalFirstLetter(String str) {
		return Arrays.stream(str.split(" "))
				.map(word -> word.toLowerCase())
				.map(word -> word.substring(0,1).toUpperCase() + word.substring(1))
				.reduce((word1, word2) -> word2 + " "+ word1)
				.orElse(" ");
	}

}
