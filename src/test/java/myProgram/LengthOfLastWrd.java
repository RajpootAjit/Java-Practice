package myProgram;

public class LengthOfLastWrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I love India";
		str = str.toLowerCase();
		String words[] = str.split(" ");
//		System.out.println(words[2].length());
		for(String word : words) {
			if(word.length()>=1)
			System.out.println(word.charAt(0));
		}

	}

}
