package basicPrograms;

public class NumberReverse {

	public static void main(String[] args) {


		int a = 12345, rev = 0;
		System.out.println("Actual number: "+a);
		
		while(a!=0)
		{
			int digit = a % 10;
			rev = rev * 10 + digit;
			a = a / 10;
		}
		
		System.out.println("Reversed number: "+rev);

	}

}
