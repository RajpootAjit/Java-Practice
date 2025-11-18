package todaysPro;

public class RemoveFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ajit Kumar Singh";
		//char ch[] = str.trim().toLowerCase().toCharArray();
		String[] words = str.split("\\s+");
		
		for(String word : words) {
			System.out.println(word.charAt(0));
		}
		
		

	}

}
