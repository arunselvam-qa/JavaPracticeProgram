package stringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String a = "Welcome Home!!";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		HashSet<Character> set = new HashSet<Character>();
		for(char c : a.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		
		
		/***************************** ANOTHER WAY ************************/
		
		
		String b = "Neww Worllld";
		b = b.toLowerCase();
//		HashSet<Character> hs = new HashSet<Character>();
		ArrayList<Character> al = new ArrayList<Character>();
		String unique = "";
		
		for(char c: b.toCharArray()) {
			if(!al.contains(c)) {
				//hs.add(c);
				al.add(c);
				unique = unique + c;
			}
		}
		System.out.println(al);
		System.out.println(unique);

	}

}
