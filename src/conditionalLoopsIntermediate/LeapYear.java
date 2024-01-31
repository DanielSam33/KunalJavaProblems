package conditionalLoopsIntermediate;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Year : ");
		int year=s.nextInt();
		System.out.println();
		if(year%4==0) {
			System.out.print("Its is a Leap Year!!");
		}
		else {
			System.out.print("Its is not a Leap Year!!");
		}
		s.close();
	}

}
