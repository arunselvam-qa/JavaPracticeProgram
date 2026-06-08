package numberPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1233210;
		int rnum = num;
		int rev = 0;
		while(num>0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		System.out.println("The reverse of given number "+rnum+ " is: "+rev);
		if(rev == rnum) {
			System.out.println("The given number "+rnum+" is a Palindrom number");
		}
		else
		{
			System.out.println("The given number "+rnum+" is not a Palindrom number");
		}

	}

}
