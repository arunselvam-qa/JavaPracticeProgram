package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String a = "Welcome to the World";
		
		for(int i = 0 ; i<a.length(); i++) {
			char c = a.charAt(i);
			int count = 0;
			for(int j = 0 ; j<a.length(); j++) {
				char d = a.charAt(j);
				if(c == d) {
					count++;
				}
			}
			if(count < 2) {
				System.out.println("The FirstNonRepeatedChar in string "+a+ " is " +a.charAt(i));
				break;
			}
		}
		
		/***************************** ANOTHER WAY ************************/
		//With Linked hash map
		
		String b = "Welcome to the World";
		b = b.toLowerCase();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(char c : b.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("The FirstNonRepeatedChar in string "+b+ " is " +entry.getKey());
				break;
			}
		}
	}

}
