package myProgram;


public class PrintFirstCharacterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajit kumar singh";
		// a k s
		char ch[] = str.toCharArray();
	    System.out.print(ch[0]+" ");
		
		for(int i=0; i<str.length()-1; i++) {
			if(ch[i] == ' ' && ch[i+1] != ' ' ) {
				
			 System.out.print(ch[i+1]+" ");
				
			}
			 
			
		}
		
		}
		

	}





