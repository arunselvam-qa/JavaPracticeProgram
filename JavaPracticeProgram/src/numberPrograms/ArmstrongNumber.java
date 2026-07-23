package numberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 152;
		int newNum = 0;
		int digit = String.valueOf(number).length();
		int n = number;
		
		while(number > 0) {
			
			int temp = number % 10;
			newNum = newNum + (int)Math.pow(temp, digit);
			number = number / 10;
		}
		
		System.out.println(newNum == n ? "The number "+n+ " is Armstrong number" : "The number "+n+ " is not a Armstrong number");

	}

}
