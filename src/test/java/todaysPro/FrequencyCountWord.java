package todaysPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCountWord {
	
	public static void main(String[] args) {
		
		String str = "Vikash Kumar Mishra Ajit Kumar Singh";
		String[] words = str.trim().toLowerCase().split("\\s+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
			
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
	}

}
