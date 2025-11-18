package myProgram;

import java.util.HashSet;
import java.util.Set;

public class FoundFirstRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajit";
		Set<Character> seen = new HashSet<Character>();
		boolean flag = false;
		for(char ch : str.toCharArray()) {
			if(seen.contains(ch)) {
				System.out.println("first repeat character is found "+ ch);
				flag = true;
				break;
				
				
			}
			else {
				seen.add(ch);
			}
		}
		if(!flag) {
			System.out.println("no repeat character has found");
		}

	}

}
