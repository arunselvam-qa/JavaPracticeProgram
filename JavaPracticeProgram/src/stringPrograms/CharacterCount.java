package stringPrograms;

import java.util.HashMap;


public class CharacterCount {

	public static void main(String[] args) {
		String a = "Welcome Home Honey";
		a = a.replace(" ", "").toLowerCase();
		System.out.println(a);
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		for(char c : a.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
			
			/***************************** ANOTHER WAY ************************/
			//Without if else condition
			
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		System.out.println(hm);
		System.out.println(hm1.entrySet());
		
		/***************************** ANOTHER WAY ************************/
		//Without hash map
		
		for(char j = 'a' ; j<='z' ; j++) {
			int count = 0;
			for(int i = 0 ; i<a.length(); i++) {
				if(a.charAt(i)==j) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("The character " +j+ " occurs "+count+ " time(s)");
			}
		}
		
	}
}