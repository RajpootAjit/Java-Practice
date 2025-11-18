package todaysPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Vikash Kumar Mishra";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character ch : str.toCharArray()) {
			if(ch !=' ') {
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
			
		}
		System.out.println(map);
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+"-> "+ entry.getValue()+" ");
			
		}

	}

}
