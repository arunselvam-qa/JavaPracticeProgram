package stringPrograms;

import java.util.LinkedHashMap;

public class ReplaceOccuranceWithCount {

	public static void main(String[] args) {
		String a = "Hello Aruunnnn!";  //Output - he22o ar224444!
		a = a.toLowerCase();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for(char c : a.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}

		StringBuilder sb = new StringBuilder();
		for(char c : a.toCharArray()) {
			if(hm.get(c) > 1) {
				sb.append(hm.get(c));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());


	}

}
