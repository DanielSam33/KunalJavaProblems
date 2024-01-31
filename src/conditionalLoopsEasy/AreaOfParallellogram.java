package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfParallellogram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter tha Base : ");
		double base=s.nextDouble();
		System.out.println("Enter the Perpendicular Heigth : ");
		double heigth=s.nextDouble();
		
		System.out.println("Area of Parallelogram : "+(base*heigth));
	}
}
