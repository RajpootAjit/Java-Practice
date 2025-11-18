package myProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FoundFirstNonRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "eaabbccd";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("first non repeat character is "+ entry.getKey());
				break;
			}
			
		}

	}

}
