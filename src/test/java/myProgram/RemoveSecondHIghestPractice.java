package myProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveSecondHIghestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 400);
		map.put("two", 600);
		map.put("three", 700);
		map.put("four", 300);
		
		// converting into the list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		// sorting the order since map gives unordered list
		list.sort((a,b)-> a.getValue().compareTo(b.getValue()));
		
		Entry<String, Integer> secondHighest = list.get(2);
		
		// now removing the second highest
		map.remove(secondHighest.getKey());
		
		System.out.println(map);
		

	}

}
