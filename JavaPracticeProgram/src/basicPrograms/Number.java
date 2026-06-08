package basicPrograms;

public class Number {
	
	public static void main(String arg[]) {
		String str = "ogiggy";
		int count = 0;
		for(int i = 0 ; i< str.length() ; i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e'||c == 'i'|| c ==  'o'|| c== 'u') {
				count++;
			}
		}
		System.out.println(count>0 ? "Pass"+count : "Fail");
	}

}
