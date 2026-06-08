package arrayPrograms;

public class MaxValueWithoutSort {

	public static void main(String[] args) {
		int [] arr = {3, 5, 4, 7, 6, 1, 2, 9, 8, 0};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
				
			}
			else if(num > secondLargest && num != largest) {
				secondLargest = num;
			}
			if(num < lowest) {
				lowest = num;
			}
		}
		
		System.out.println("Largest - "+largest);
		System.out.println("Second Largest - "+secondLargest);
		System.out.println("Lowest - "+lowest);
	}

}
