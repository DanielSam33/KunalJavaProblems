package conditionalLoopsEasy;

import java.util.Scanner;

public class NumberPrintingAndSumOfThoseInputs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number,total=0;
		
		do {
			System.out.print("Enter the Number until 0 : ");
			number=s.nextInt();
			total=total+number;
		}while(number!=0);
		System.out.println("The Sum Of all Numbers is "+total);
		s.close();
	}
}
