package todaysPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajeet";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				Character duplicateValue = entry.getKey();
	//			map.remove(duplicateValue);
				System.out.println(entry.getKey());
			}
		}
		System.out.println(map);

	}

}
