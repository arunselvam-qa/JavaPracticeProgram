package arrayPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class ElementFrequency {

	public static void main(String[] args) {
		
		int a[] = {6, 1, 2, 3, 4, 1, 5, 1, 3, 2, 1, 6};
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int x : a) {
			hm.put(x, hm.getOrDefault(x, 0)+1);
		}
		
		System.out.println(hm);
		for(Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println("The number "+entry.getKey()+ " occurs "+entry.getValue()+ " time(s)");
		}

	}

}
