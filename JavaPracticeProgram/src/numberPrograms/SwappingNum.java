package numberPrograms;

public class SwappingNum {

	public static void main(String[] args) {
		
		int a = 5, b = 0;
		System.out.println("Before swapping : "+a+ " & "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : "+a+ " & "+b);

	}

}
