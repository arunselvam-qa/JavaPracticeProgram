package arrayPrograms;

import java.util.Arrays;

public class AscendingSort {

	public static void main(String[] args) {

		int [] arr = {3, 5, 4, 7, 6, 1, 2, 9, 8};
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		/**************** BuiltIn Method ****************/

		int [] arr1 = {3, 5, 4, 7, 6, 1, 2, 9, 8};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
