package string_Program;

public class VowelCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "radhey radhey";
		StringBuilder vow = new StringBuilder();
		StringBuilder conso = new StringBuilder();
		int count[] = new int[256];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vow.append(ch);
				count[ch]++;
			}
			else {
				if(ch !=' ') {
					conso.append(ch);
					count[ch]++;
				}
			}
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println((char)i+ " "+ count[i]);
			}
		}
		System.out.println(String.valueOf(vow));
		System.out.println(String.valueOf(conso));

	}

}
