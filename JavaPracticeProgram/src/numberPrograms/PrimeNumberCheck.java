package numberPrograms;

public class PrimeNumberCheck {
	
	static boolean isPrime(int num) {
		if(num<=0) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(num+ ( isPrime(num) ? " is a prime" : " is not a prime"));

	}

}
