package conditionalLoopsIntermediate;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the No of Numbers : ");
		int no=s.nextInt();
		System.out.print("Enter the Numbers One by One : ");
		int input=0;
		float sum=0;
		for(int i=0;i<no;i++) {
			input=s.nextInt();
			System.out.print(input+" ");
			sum=sum+input;
			
		}
		System.out.println();
		System.out.print("Sum Of "+no+" Numbers : "+sum);	
	}
}
