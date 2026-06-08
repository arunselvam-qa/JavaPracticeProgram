package basicPrograms;

public class PrimeNumber {
	
	static int number = 47;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			if(isPrime(number))
			{
				System.out.println(number+ " is a Prime number");
			}
			else
			{
				System.out.println(number+ " is not a Prime number");
			}

	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
		{
			return false;
		}
		
		for(int i = 2; i< number; i++)
		{
			if(number%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
