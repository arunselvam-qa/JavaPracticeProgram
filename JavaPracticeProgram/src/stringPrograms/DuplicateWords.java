package stringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateWords {

	public static void main(String[] args) {


		String a = "Java Selenium Java Playwright TypeScript Playwright Selenium Java";
		a = a.toLowerCase();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s : a.split(" ")) {
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		
		for(Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("The word "+entry.getKey()+ " duplicated "+entry.getValue()+ " times");
			}
		}

	}

}
