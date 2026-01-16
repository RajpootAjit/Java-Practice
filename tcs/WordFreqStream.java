package tcs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFreqStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Words = Arrays.asList("ajit", "amit", "ajit", "anil");
		Map<String, Long> frequency = Words.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
		for(Map.Entry<String, Long> entry:frequency.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
			
		}
		

	}

}
