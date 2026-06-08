package numberPrograms;

public class numberSequence1 {

	public static void main(String[] args) {

		int firstNum = 100, num = 10;  //Output = 100, 10, 90, 20, 80, 30, 70, 40, 60, 50 
		int secondNum = num;
		
		while(firstNum >= secondNum) {
			System.out.print(firstNum + ", " + secondNum + ", ");
			firstNum -= num;
			secondNum += num;
		}
		

	}

}
