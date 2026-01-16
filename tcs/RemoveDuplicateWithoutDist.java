package tcs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateWithoutDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Words = List.of("ajit", "amit", "anil", "ajit", "akash", "anil");
		Set<String> seen = new HashSet<String>();
		List<String> uniqueWord = Words.stream().filter(word -> seen.add(word)).collect(Collectors.toList());
		System.out.println(uniqueWord);
	}

}
