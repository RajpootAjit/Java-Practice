package practice_Optum;

public class Vowel {
	
	public static void main(String[]args) {
		String input = "ajit singh";
		String lowerCase = input.toLowerCase();
		int count[] = new int[256];
//		String vowel = "";
//		String consonents = "";
		for(char c : lowerCase.toCharArray()) {
			if(c == 'i'|| c=='e'|| c=='a'|| c=='o'|| c=='u') {
				
//				    vowel += (c);
					count[c]++;
					
				
			}
			else {
				
//				consonents += c; 
				count[c]++;
			}
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>0 && Character.isLetter((char)i) ){
				System.out.println(" "+ (char)i + "--->> "+ count[i]);
				
			}
		}
//		System.out.println(vowel);
//		System.out.println(consonents);
	}

}
