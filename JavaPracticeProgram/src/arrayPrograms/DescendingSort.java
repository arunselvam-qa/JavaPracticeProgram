package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {

	public static void main(String[] args) {
		int [] arr = {3, 5, 4, 7, 6, 1, 2, 9, 8};
		
		for(int i = 0 ; i < arr.length - 1; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		/**************** BuiltIn Method ****************/
		
		Integer [] arr1 = {3, 5, 4, 7, 6, 1, 2, 9, 8};
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		
		int secLargest = arr1[1];
		int largest = arr1[0];
		int lowest = arr1[arr1.length-1];
		
		System.out.println("Largest - "+largest);
		System.out.println("Second Largest - "+ secLargest);
		System.out.println("Lowest - "+lowest);

	}

}
