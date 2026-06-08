package stringPrograms;

public class ReverseStringAlpNum {

	public static void main(String[] args) {
		String a = "43ed2cb1A"; //Abcde1234
		
		StringBuffer alphabet = new StringBuffer();
		StringBuffer numeric = new StringBuffer();
		
		for(char c : a.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				alphabet.append(c);
			}
			else if(Character.isDigit(c)) {
				numeric.append(c);
			}
		}
		System.out.println(alphabet.reverse().toString() +""+ numeric.reverse().toString());
	}

}
