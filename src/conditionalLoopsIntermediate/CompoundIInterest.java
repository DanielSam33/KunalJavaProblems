package conditionalLoopsIntermediate;

import java.util.Scanner;

public class CompoundIInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Principal : ");
		float principal=s.nextFloat();
		System.out.print("Enter the Rate Of Interest : ");
		float interest=s.nextFloat();
		System.out.print("Enter the Number Of Years : ");
		float years=s.nextFloat();
		
		double result=principal*Math.pow((1+interest/100), years);
		System.out.println();
		System.out.print("Compound Interest : "+result);
		s.close();
	}

}
