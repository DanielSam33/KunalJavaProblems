package conditionalLoopsIntermediate;

import java.util.Scanner;

public class NCR_NPR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the N : ");
		int n=s.nextInt();
		System.out.print("Enter the R : ");
		int r=s.nextInt();
		
		double factofN=1;
		double factofR=1;
		
		for(int i=1;i<=n;i++ ) {
			factofN*=i;
		}
		for(int i=1;i<=r;i++) {
			factofR=factofR*i;
		}
		
		int temp=n-r;
		double factofTemp=1;
		for(int i=1;i<=temp;i++) {
			factofTemp=factofTemp*i;
		}
		
		double ncr=factofN/(factofR*factofTemp);
		double npr=factofN/factofTemp;
		System.out.print("The Factorial of n is "+factofN);
		System.out.println();
		System.out.print("The Factorial of r is "+factofR);
		System.out.println();
		System.out.print("The NCR is "+ncr);
		System.out.println();
		System.out.print("The NPR is "+npr);
		s.close();
	}

}
