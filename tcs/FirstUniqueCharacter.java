package tcs;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "swiss";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		
		for(char ch : str.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println("first repeat character is found : "+ ch);
				break;
			}
		}
		

	}

}
