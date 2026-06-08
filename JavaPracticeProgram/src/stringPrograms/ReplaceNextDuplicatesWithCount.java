package stringPrograms;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class ReplaceNextDuplicatesWithCount {

	public static void main(String[] args) {
		String a = "Hello Aruunnnn!";  //Output - hel2o aru2n444!
		a = a.toLowerCase();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(char c : a.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		StringBuilder sb = new StringBuilder();
		HashSet<Character> presentedAleady = new HashSet<Character>();
		for(char c : a.toCharArray()) {
			if(hm.get(c) > 1) {
				if(!presentedAleady.contains(c)) {
					sb.append(c);
					presentedAleady.add(c);
				}
				else {
					sb.append(hm.get(c));
				}
				
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}
}
