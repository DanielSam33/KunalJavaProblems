package conditionalLoopsIntermediate;

import java.util.Scanner;

public class PowerValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int input=s.nextInt();
		System.out.print("Enter the Power : ");
		int power=s.nextInt();
		
		float result=(float) Math.pow(input, power);
		System.out.print("The Power is "+result);
		s.close();
		
	}
}
