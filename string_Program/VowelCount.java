package string_Program;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ajit singh";
		char[] vow = new char[str.length()];
		char[] conso = new char[str.length()];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				vow[index] = str.charAt(i);
				index++;

			} else {
				if(str.charAt(i)!=' ') {
					conso[index] = str.charAt(i);
					index++;
				}
				
			}
		}
		System.out.println(String.valueOf(vow));
		System.out.println(String.valueOf(conso));

	}

}
