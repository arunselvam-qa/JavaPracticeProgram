package stringPrograms;

public class CountAlphabetAndNumber {

	public static void main(String[] args) {

		String a = "1abc32de45f$";
		char[] b = a.toCharArray();
		int letterCount = 0 , numberCount = 0;
		StringBuffer word = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		for(char c : b) {
			if(Character.isLetter(c)) {
				letterCount++;
				word.append(c);
			}
			if(Character.isDigit(c)) {
				numberCount++;
				digit.append(c);
			}
		}
		System.out.println("There are "+letterCount+ " letters and "+numberCount+ " numbers in "+a);
		System.out.println(word);
		System.out.println(digit);

	}

}
