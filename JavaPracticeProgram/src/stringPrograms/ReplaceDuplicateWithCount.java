package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ReplaceDuplicateWithCount {

	public static void main(String[] args) {

		String a = "Hello Aruunnnn!";   //Output - he2o ar24!
		a = a.toLowerCase();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		for(char c : a.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				sb.append(entry.getValue());
			}
			else {
				sb.append(entry.getKey());
			}
		}
		System.out.println(sb.toString());

	}

}
