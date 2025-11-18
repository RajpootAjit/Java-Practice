package todaysPro;

public class ReverseWordbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ajit Kumar Singh";
		String str1 = "amit";
		str = str.trim().toLowerCase();
		String[] words = str.split("\\s+");
		char ch[] = str1.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(String.valueOf(ch[i])+" ");
		}
		
		
//		for(int i=words.length-1; i>=0; i--) {
//			System.out.print(words[i]+" ");
//			
//		}
//		
//		System.out.println("----------------------------");
		
//		for(String word : words) {
//			char ch[] = word.toCharArray();
//			for(int i=ch.length-1; i>=0; i--) {
//				System.out.print(ch[i]+"");
//			}
//			System.out.print(" ");
//		}

	}

}
