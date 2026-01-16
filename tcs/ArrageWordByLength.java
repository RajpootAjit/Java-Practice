package tcs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrageWordByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("ajit", "ramesh", "harishchandra","tal");
		Map<Integer, List<String>> wordLength = words.stream().collect(Collectors.groupingBy(word->word.length()));
		for(Map.Entry<Integer, List<String>> entry:wordLength.entrySet()) {
			System.out.println("Length "+entry.getKey() +" -> "+ entry.getValue());
		}

	}

}
