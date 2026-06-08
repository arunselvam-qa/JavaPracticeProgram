package basicPrograms;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 15;
		System.out.println("Numbers before swapping: a - "+a+", b - "+b );
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("Numbers before swapping: a - "+a+", b - "+b );

	}

}
