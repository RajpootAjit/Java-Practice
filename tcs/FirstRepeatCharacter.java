package tcs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ajit singh";
		Set<Character> seen = new HashSet<Character>();
		boolean result = false;
		for(char c : input.toCharArray()) {
			if(seen.contains(c)) {
				System.out.println("first repeat character is "+ c);
				result = true;
				break;
			}
			else {
				seen.add(c);
			}
			
			
			
		}
		if(!result) {
			System.out.println("not found");
		}
		

	}

}
