package basicPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Listen", s2 = "Silent";
		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();
		
		if(c1.length!= c2.length)
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Strings are Anagram");
			}
			else
			{
				System.out.println("Strings are not Anagram");
			}
		}

	}

}
