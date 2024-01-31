package firstProgram;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		double num1=s.nextDouble();
		System.out.print("Enter the Number : ");
		double num2=s.nextDouble();
		double ans=0;
		
		while(true) {
		System.out.print("Select the Operator or press X to exit : ");
		char op=s.next().trim().charAt(0);
		if(op=='+') {
			ans=num1+num2;
		}
		if(op=='-') {
			ans=num1-num2;
		}
		if(op=='*') {
			ans=num1*num2;
		}
		if(op=='/'&& num2!=0) {
			ans=num1/num2;
		}
		if(op=='%' && num2!=0) {
			ans=num1%num2;
		}
		else if(op=='x'||op=='X') {
			System.out.println("Thank You");
			break;
		}
		System.out.print("Output : "+ans);
		System.out.println();
		}
		s.close();
	}
}
