package myProgram;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "apple";
		// removing extra space
		str = str.toLowerCase().replace(" ", "");
		//String words[] = str.split(" ");
		char chars[] = str.toCharArray();
		int freq[] = new int[256];
//		for(char ch : chars) {
//			freq[ch]++;
//			
//		}
		//System.out.println("unique characters");
		boolean found = false;
		for(char ch : chars) {
			if(freq[ch] == 0) {
				System.out.print(ch+" ");
				//found = true;
				freq[ch] = 1;
			}
			
		}
//		if(!found) {
//			System.out.println("no unique character found");
//			
//		}

	}

}
