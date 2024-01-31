package conditionalLoopsIntermediate;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int input=s.nextInt();
		System.out.println();
		int sum=0;
		
		for(int i=1;i<input;i++) {
			if(input%i==0) {
			sum=sum+i;
			}
		}
			if(sum==input) {
				System.out.print("It is a Perfect Number!!");
			}
			else {
				System.out.print("Not a Perfect Number!!");
			}
		}
	}


