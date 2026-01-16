package tcs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ajeet";
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
//		System.out.println(set);
		for (char ch : set) {
			sb.append(ch);
		}
		System.out.println(sb.toString());
		// System.out.println(sb.toString());
		
		String result = str.chars().distinct().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println(result);

	}
    
	
	
	

}
