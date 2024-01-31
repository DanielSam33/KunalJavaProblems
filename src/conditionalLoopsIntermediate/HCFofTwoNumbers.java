package conditionalLoopsIntermediate;

import java.util.Scanner;

public class HCFofTwoNumbers {

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
	    System.out.println();
	    while (two != 0) {
	        int temp = two;
	        two = one % two;
	        one = temp;
	    }
	    System.out.print("The HCF of Two Numbers is "+one);
			
		s.close();
	}
}