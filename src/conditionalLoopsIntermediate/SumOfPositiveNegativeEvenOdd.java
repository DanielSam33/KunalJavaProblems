package conditionalLoopsIntermediate;

import java.util.Scanner;

public class SumOfPositiveNegativeEvenOdd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n,sn=0,so=0,se=0;
		System.out.print("Enter the Numbers : ");
		n=s.nextInt();
		
		while(n!=0) {
			if(n<0) {
				sn+=n;
			}
			else if(n%2==0) {
				se+=n;
			}
			else {
				so+=n;
			}
			n=s.nextInt();
		}
		System.out.print("Sum of Negative Numbers : "+sn);
		System.out.println();
		System.out.print("Sum of Positive Even Numbers : "+se);
		System.out.println();
		System.out.print("Sum of Positive Odd Numbers : "+so);
		s.close();
	}
}
