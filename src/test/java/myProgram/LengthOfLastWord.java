package myProgram;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "fly me to moon";
//		String[] words = str.split(" ");
//		String lastWord = words[words.length-1];
//		System.out.println(lastWord.length());
		
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i=str.length()-1; i>0; i--) {
			if(ch[i] == ' ') {
				break;
			}
			count++;
				
			}
			
			
		
		System.out.println("length of last word "+ count);
		
	}

}
