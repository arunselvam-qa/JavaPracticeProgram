package basicPrograms;

import java.util.Arrays;

public class NthLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {7, 61, 30, 90, 45, 20, 50, 52};
		int n = 7;
		
		Arrays.sort(num);
		int nthLargest = num[num.length-n];
		System.out.println(n+" largest number in array is "+nthLargest);

	}

}
