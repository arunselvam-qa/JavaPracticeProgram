package basicPrograms;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "google";
		
		for(int i = 0 ; i<str.length(); i++)
		{
			int count = 0;
			char c = str.charAt(i);
			for(int j = 0; j < str.length(); j++)
			{
				char d = str.charAt(j);
				if(c == d)
				{
					count++;
				}
			}
			if(count<2)
			{
				System.out.println("The first non repeated char in the String is: "+c);
				break;
			}
		}

	}

}
