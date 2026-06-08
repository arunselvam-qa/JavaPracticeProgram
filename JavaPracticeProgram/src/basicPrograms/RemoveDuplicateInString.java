package basicPrograms;

import java.util.HashSet;

public class RemoveDuplicateInString {
	
	public static void main(String[] args) {
	
	String s = "qqwertyty", ns = "";
	//StringBuilder sb = new StringBuilder();
	HashSet<Character> hs = new HashSet<Character>();
	
	for(char c : s.toCharArray())
	{
		if(!hs.contains(c))
		{
			hs.add(c);
			ns = ns + c;
			//sb.append(c);
		}
	}
	System.out.println(ns);
	}
}
