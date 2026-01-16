package tcs;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatCharByStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "swiss";
		Map<Character, Long> countCharacter = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
		Character result = 0;
		for(char c : input.toCharArray()) {
			if(countCharacter.get(c) == 1) {
				result = c;
				break;
			}
			
		}
		System.out.println("First  non repeat character is "+ result);

	}

}
