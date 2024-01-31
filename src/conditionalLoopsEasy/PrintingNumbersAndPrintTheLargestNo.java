package conditionalLoopsEasy;

import java.util.Scanner;

public class PrintingNumbersAndPrintTheLargestNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number,max =0;
		
		do {
			System.out.print("Enter the Number until 0 : ");
			number=s.nextInt();
			if(number>max)
				max=number;
		}while(number!=0);
		
		System.out.print("The Largest number is "+max);
		
		
		s.close();
	}
}
