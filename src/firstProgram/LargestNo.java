package firstProgram;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		double num1=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Number : ");
		double num2=s.nextDouble();
		
		System.out.println();
		if(num1!=0&&num2!=0&&num1>num2) {
			System.out.print("The Largest Number is "+num1);
		}
		
		else if(num1!=0&&num2!=0&&num1<num2) {
			System.out.print("The Largest Number is "+num2);
		}
		s.close();
	}
}
