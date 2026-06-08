package numberPrograms;

public class FibonacciOfNumber {

	public static void main(String[] args) {

		int num = 5;
		int a = 0, b = 1;
		System.out.print("The Fibonacci for first "+num+ " numbers are "+a);
		for(int i = 1; i<=num-1; i++) {
			System.out.print(" ");
			int temp = a + b;
			a = b;
			b = temp;
			System.out.print(a);
			
		}

	}

}
