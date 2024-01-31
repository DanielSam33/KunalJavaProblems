package conditionalLoopsIntermediate;

import java.util.Scanner;

public class CommissionPercentage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Amount : ");
		float amt=s.nextFloat();
		System.out.print("Enter the Commission Percentage : ");
		float percent=s.nextFloat();
		
		float result=(percent/100)*amt;
		System.out.println("The Commission Money is "+result+" Rupees!!");
		
}	
}
