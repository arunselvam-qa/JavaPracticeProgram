package basicPrograms;

public class PrintNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "qwe321rty89", newstr = "";
		
		for(int i =0; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= '0' &&  ch <= '9')
			{
				newstr = newstr + ch;
			}
		}
		System.out.println(newstr);

	}

}
