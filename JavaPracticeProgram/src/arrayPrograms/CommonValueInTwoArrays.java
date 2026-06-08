package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonValueInTwoArrays {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};
		int b[] = {5, 6, 7, 2, 3, 8, 1};
		System.out.print("Common values are: ");
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++) {
				if(a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
		
		
		/**************** Another Method ****************/
		//Using HashSet
		
		Set<Integer> hs1 = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		for(int x : a) {
			hs1.add(x);
		}
		for(int x : b) {
			if(hs1.contains(x)) {
				common.add(x);
			}
		}
		System.out.println(" ");
		System.out.println("Common values are: "+common);

	}

}
