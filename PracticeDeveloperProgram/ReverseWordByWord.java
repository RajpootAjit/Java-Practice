package PracticeDeveloperProgram;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ajit kumar singh";
		String reversedString = reversedCapitalFirstLetter(input);
		System.out.println(reversedString);
		
		

	}
	
	// split the word
	
	public static String reversedCapitalFirstLetter(String str) {
		// split the word in the array.
		//["ajit" "kumar" "singh"]
		
		String[] words = str.split(" ");
		
		StringBuilder reverse = new StringBuilder();
		// capitalize the first letter string
		for(int i=words.length - 1 ; i>=0 ; i--) {
			String word = words[i].toLowerCase(); // first we are making first character as lower case
			reverse.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
			if(i != 0) {
				reverse.append(" ");
			}
		}
		return reverse.toString();
	}

}
