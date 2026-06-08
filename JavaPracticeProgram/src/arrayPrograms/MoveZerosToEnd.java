package arrayPrograms;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int arr[] = {0, 1, 3, 0, 3, 5, 8, 2, 0};
		int pos = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != 0) {
				arr[pos++] = arr[i];
			}
		}
		while(pos<arr.length) {
			arr[pos++] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
