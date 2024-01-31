package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Sides : ");
		double sides=s.nextDouble();
		
		double ans=(Math.sqrt(3)/4)*(sides*sides);
		System.out.println("Area Of Equilateral Triangle : "+ans);
	}
}
