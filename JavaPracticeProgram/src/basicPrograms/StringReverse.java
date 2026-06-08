package basicPrograms;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Juoju", rev = "";
		for(int i = (s.length()-1) ; i>=0; i--)
		{
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		
		System.out.println(rev);
		
		//Another way
		StringBuilder sb = new StringBuilder("Arun321");
		sb.reverse();
		System.out.println(sb);

	}

}
