package conditionalLoopsIntermediate;

import java.util.Scanner;

public class DepreciationSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Product Value : ");
		float product=s.nextFloat();
		System.out.print("Enter the Number Of Years for calculating Depreciation Value : ");
		float years=s.nextFloat();
		System.out.print("Enter the Depreciation Percentage : ");
		float percent=s.nextFloat();
		
		System.out.println();
		double result=product-((product*percent/100)*years);
		System.out.print("The Value Of Product After Depreictaion is "+result);
		s.close();
	}
}
