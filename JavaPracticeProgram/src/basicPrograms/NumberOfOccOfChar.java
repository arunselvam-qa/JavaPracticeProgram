package basicPrograms;

public class NumberOfOccOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abdaecedef";
		String ns = s.toLowerCase();
		
		for( char ch = 'a'; ch <= 'z'; ch++)
		{
			int count = 0;
			for(int i = 0; i< s.length(); i++)
			{
				if(ns.charAt(i)== ch)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch +" occurs "+count+ " times");
			}
		}

	}

}
