package myProgram;

public class StringFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajit singh ajit";
		boolean flag = false;
		//String[] words = str.split("\\s+");
		//for(String word : words) {
			if(str.toLowerCase().contains("ajit singh")) {
				System.out.println("found");
			}
			
		//}
		
		else {
			System.out.println("not found");
		}

	}

}
