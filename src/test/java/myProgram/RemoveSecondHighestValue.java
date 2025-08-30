package myProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveSecondHighestValue {
	
	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 20);
        map.put("C", 70);
        map.put("D", 40);

        // Convert entries into a list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort list by value (descending)
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Get 2nd highest (index 1)
        Map.Entry<String, Integer> secondHighest = list.get(1);

        // Remove it from map
        map.remove(secondHighest.getKey());

        System.out.println("After removing 2nd highest value: " + map);
    }

}
