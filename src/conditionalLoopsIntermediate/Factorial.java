package conditionalLoopsIntermediate;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int input=s.nextInt();
		double temp=1;
		
		System.out.print("Factorial Series of "+input+" is ");
		for(int i=1;i<=input;i++) {
			temp=temp*i;
			System.out.print(" "+temp);
		}
		System.out.println();
		System.out.print("The Factorial of "+input+" is "+temp);
		s.close();
	}
}
