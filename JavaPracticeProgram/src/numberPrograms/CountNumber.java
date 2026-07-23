package numberPrograms;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 404101;
		int num1 = num;
		int count = 0, sum = 0;
		if(num<9) {
			count = 1;
			sum = num;
		}
		else {
			while(num>0) {
				count++;
				int digit = num%10;
				sum = sum + digit;
				num = num/10;
			}
		}

		System.out.println("The count of digits in the given number "+num1+" is: "+count);
		System.out.println("The Sum of digits in the given number "+num1+" is: "+sum);
		
		//Another way to count int
		int count1 = String.valueOf(num1).length();
		System.out.println("The count of digits in the given number "+num1+" is: "+count1);
	}

}
