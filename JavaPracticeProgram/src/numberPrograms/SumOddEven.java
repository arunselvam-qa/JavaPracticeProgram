package numberPrograms;

public class SumOddEven {

	public static void main(String[] args) 
	{
			int num = 99;
			int evenSum = 0, oddSum = 0;
			System.out.println(num%2== 0 ? "Even" : "Odd");
			for(int i = 1; i<=num; i++)
			{
			    if(i%2==0){
			        evenSum = evenSum + i;
			    }
			    else{
			        oddSum = oddSum + i;
			    }
			}
			System.out.println("The sum of even numbers till "+num+ " is :"+ evenSum);
			System.out.println("The sum of Odd numbers till "+num+ " is :"+ oddSum);
	}	

}
