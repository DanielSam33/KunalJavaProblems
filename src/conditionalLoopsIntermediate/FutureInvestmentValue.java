package conditionalLoopsIntermediate;

import java.util.Scanner;

public class FutureInvestmentValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Principal : ");
		float principal=s.nextFloat();
		System.out.print("Enter the Number Of Years : ");
		float years=s.nextFloat();
		System.out.print("Enter the Interest Percentage : ");
		float interest=s.nextFloat();
		
		System.out.println();
		double result=principal+(principal*(interest/100*years));
		System.out.print("The Value Of Future Investment Value is "+result);
		s.close();
	}

}
