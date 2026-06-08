package stringPrograms;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String a = "This String contains five words!";
		String[] arr = a.split(" ");
		System.out.println(arr.length);
	}

}
