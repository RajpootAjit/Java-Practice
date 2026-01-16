package practice_Optum;

public class Vowel_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ajit is doing automation";
		input.toLowerCase();
		int[] count = new int[256];
		for(char c : input.toCharArray()) {
			if(c == 'i'|| c=='e'|| c=='a'|| c=='o'|| c=='u') {
				
					count[c]++;
				
			}
			
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println(" "+(char)i + " "+ count[i]);
				
			}
			
		}

	}

}
