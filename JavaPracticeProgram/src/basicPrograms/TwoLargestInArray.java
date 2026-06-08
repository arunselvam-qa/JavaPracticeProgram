package basicPrograms;

public class TwoLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {30, 50, 10, 70, 60};
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i<num.length; i++)
		{
			if(num[i] > max1)
			{
				max2 = max1;
				max1 = num[i];
			}
			else if(num[i]> max2 && num[i] != max1)
			{
				max2 = num[i];
			}
		}
		System.out.println("First largest number is "+max1);
		System.out.println("Second largest number is "+max2);

	}

}
