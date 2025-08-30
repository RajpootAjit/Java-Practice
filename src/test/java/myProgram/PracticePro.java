package myProgram;

import java.util.List;
import java.util.stream.Collectors;

public class PracticePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "radhey krishna ram";
		// print first character
		String[] words = str.split(" ");
		System.out.println("printing first character of each word");
		for(String word :words) {
			if(word.length()>0) {
				System.out.println(word.charAt(0));
			}
		}
		System.out.println("printing last character of each word");
		
		// print last character of each word
		for(String word: words) {
			if(word.length()>0) {
				System.out.println(word.charAt(word.length()-1));
			}
		}
		
		System.out.println("printint non repeat charcter");
		
		
		// print non-repeat character
		String str1 = "apple";
		int freq[] = new int[256];
		char[]chars = str1.toCharArray();
		for(char ch : chars) {
			freq[ch]++;
		}
		
		for(char ch : chars) {
			if(freq[ch]>0) {
				System.out.print(ch+ " ");
				freq[ch] = 0;
			}
		}
		
		// removing dulicate by stream
		System.out.println("removing duplicate character by stream");
		String str2 = "ajeet";
		List<Character> nonDuplicateCharacter = str2.chars()
				                                    .mapToObj(c->(char)c)
				                                    .distinct()
				                                    .collect(Collectors.toList());
		System.out.println(nonDuplicateCharacter);
		
		// printing again in the form of string only
		String newString = nonDuplicateCharacter.stream().map(c->String.valueOf(c)).collect(Collectors.joining());
		System.out.println(newString);
		
		

	}


	}

