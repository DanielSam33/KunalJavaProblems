package conditionalLoopsEasy;

import java.util.Scanner;

public class NoOfFactorsOfANumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int input=s.nextInt();
		System.out.println();
		System.out.println("The Factors numbers of "+input+" are ");
		System.out.print(input+" ");
		for(int num=input/2;num>=1;num--) {
		if(input%num==0) {
		System.out.print(num+" ");
			}
		}
		s.close();
	}
}
