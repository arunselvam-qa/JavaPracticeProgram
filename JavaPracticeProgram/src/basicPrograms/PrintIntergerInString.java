package basicPrograms;

public class PrintIntergerInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Arun43g5", ns = "";
		
		for(int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
				ns = ns + c;
			}
		}
		System.out.println(ns);

	}

}
