package todaysPro;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowelFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajit kumar singh";
		List<Character> list = new ArrayList<Character>();
		for(Character ch : str.toCharArray()) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}
			else {
				list.add(ch);
			}
			
		}
		for(Character ch : list) {
			System.out.print(ch+ " ");
		}

	}

}
