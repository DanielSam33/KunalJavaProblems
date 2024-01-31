package conditionalLoopsIntermediate;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		int one=s.nextInt();
		System.out.print("Enter the Second Number : ");
		int two=s.nextInt();
		
		int hcf = 1;
	    for (int i = 1; i <= Math.min(one, two); i++) {
	        if (one % i == 0 && two % i == 0) {
	            hcf = i;
	        }
	    }
	    System.out.print("The HCF of Two Number is "+hcf);
	    int lcm=(one*two)/hcf;
	    System.out.println();
	    System.out.print("The LCM of Two Number is "+lcm);
		s.close();

	}

}
