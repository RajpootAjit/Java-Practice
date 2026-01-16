package PracticeDeveloperProgram;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "radhey radhey";
		int count = 0;
		String vowel = " ";
		for(int i=0; i<=word.length()-1; i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='i' || word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='u') {
//				char upperCase = Character.toUpperCase(word.charAt(i));
//				vowel = vowel + upperCase + " ";
				vowel = vowel + word.charAt(i)+" ";
				
				count++;
			}
		}
		System.out.println("number of vowels are :" + count);
		System.out.println(vowel);

	}

}
