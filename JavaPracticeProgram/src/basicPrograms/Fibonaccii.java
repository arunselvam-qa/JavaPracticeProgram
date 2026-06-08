package basicPrograms;

public class Fibonaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0, second = 1, next;
		int num = 10;
		for(int i = 0; i< num; i++)
		{
			System.out.print(first+ " ");
			next = first + second;
			first = second;
			second = next;
			
		}

	}

}
