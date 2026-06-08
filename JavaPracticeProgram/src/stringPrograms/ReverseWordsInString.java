package stringPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String a = "This is Reversed String";
		String[] words = a.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(String word : words) {
			StringBuffer rev = new StringBuffer(word);
			//System.out.print(rev.reverse().append(" ")); 
			//or
			sb.append(rev.reverse().append(" "));
		}
		System.out.println(sb.toString());
	}
}
