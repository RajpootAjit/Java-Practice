package tcs;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFreqStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ajeet";
		Map<Character, Long> listOfChar = input.chars()
				                               .mapToObj(c->(char)c)
				                               .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		
		for(Map.Entry<Character, Long> entry : listOfChar.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}

	}

}
