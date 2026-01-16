package practice_Optum;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ajit";
		String lowerCase = input.toLowerCase();
		Set<Character> seen = new HashSet<Character>();
		for(char c : lowerCase.toCharArray()) {
			if(seen.contains(c)) {
				System.out.println("repeat character is found as :" + c);
				return;
				
				
			}
			else {
				seen.add(c);
			}
			
			
		}
		System.out.println("no repeating character found");

	}

}
