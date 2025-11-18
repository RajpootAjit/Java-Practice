package todaysPro;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "apple";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(Character ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch : map.keySet()) {	
			System.out.print(ch);
			
		}

	}

}
