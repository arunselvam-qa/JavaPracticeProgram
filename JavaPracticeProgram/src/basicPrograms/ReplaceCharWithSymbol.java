package basicPrograms;

public class ReplaceCharWithSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "juoju until you", ns = "";
		char c1 = 'u', c2 = '$';
		int j = 1, count = 0;
		
		for(char c : s.toCharArray())
		{
			if(c == c1)
			{
				count++;
				j = count;
				 while(j!=0)
				 {
					 ns = ns + c2;
					 j--;
				 }
			}
			else
			{
				ns = ns + c;
			}
		}
		
		System.out.println(ns);

	}

}
