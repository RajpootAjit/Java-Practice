package todaysPro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveSecondHIghestValue {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vikash", 95000);
		map.put("Ajit", 75000);
		map.put("Rajni", 65000);
		map.put("Ranjan", 115000);
		
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		System.out.println(list.toString());
		list.sort((a,b)-> a.getKey().compareTo(b.getKey()));
		Entry<String, Integer> SecondHighestValue = list.get(1);
		map.remove(SecondHighestValue.getKey());
		System.out.println(map);
		System.out.println("__________________________");
		for(Map.Entry<String, Integer> entries : map.entrySet()) {
			System.out.println(entries.getKey());
			
		}
		
		
	}
	
	

}
