package PracticeDeveloperProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = Arrays.asList(2,3,4,5,6,7,8);
//		List<Integer> even_num = num.stream().filter(n -> n%2==0).collect(Collectors.toList());
//		for(int i:even_num){
//			System.out.println(i);
//			
//		}
		num.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
