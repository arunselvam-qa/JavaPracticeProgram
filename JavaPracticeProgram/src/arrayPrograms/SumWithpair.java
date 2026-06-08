package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SumWithpair {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 7, -1, 6 , 0};
        int sum = 6, count=0;
        System.out.println("Pairs with sum " + sum + ":");
        for(int i = 0 ; i < arr.length-1 ; i++) {
        	for(int j = i + 1; j < arr.length ; j++) {
        		if(arr[i] + arr[j] == sum) {
        			System.out.println(arr[i] + " + " +arr[j] + " = " +sum);
        			count++;
        		}
        	}
        }
        System.out.println("Number of combination to get sum of "+sum+ " is : "+count);
        
        /**************** Another Method ****************/
		//Using HashSet

        HashSet<Integer> hs = new HashSet<Integer>();
        
        System.out.println("Pairs with sum " + sum + ":");
        for(int num : arr) {
        	int value = sum - num;
        	if(hs.contains(value)) {
        		System.out.println(value + " + " +num + " = " +sum);
        	}
        	hs.add(num);
        }

        /**************** Another Method ****************/
		//Two Pointer ---- ONLY WORKS IF ARRAY IS SORTED
        
        
        int[] arr1 = {1, 5, 7, -1, 6 , 0};
        Arrays.sort(arr1);
        int start = 0 , end = arr1.length-1;
        
        System.out.println("Pairs with sum " + sum + ":");
        
        while(start < end) {
        	int csum = arr1[start] + arr1[end];
        	if(csum == sum) {
        		System.out.println(arr1[start] + " + " +arr1[end] + " = " +sum);
        		start++;
        		end--;
        	}
        	else if(csum < sum) {
        		start++;
        	}
        	else {
        		end--;
        	}
        }
        

	}

}
