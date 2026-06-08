package arrayPrograms;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevereseArray {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int start = 0, end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		/**************** BuiltIn Method ****************/
		//Using collections
		
		Integer[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		List<Integer> al = Arrays.asList(arr1);
		Collections.reverse(al);
		
		System.out.println(al);

	}

}
