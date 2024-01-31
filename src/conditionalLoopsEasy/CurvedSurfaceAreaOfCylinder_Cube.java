package conditionalLoopsEasy;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder_Cube {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Radius of Cylinder : ");
		double radiusofcylinder=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Heigth of Cylinder : ");
		double heigthofcylinder=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Size of Sides of Cube : ");
		double sidesofcube=s.nextDouble();
		System.out.println();
		
		double result=2*3.14*radiusofcylinder*heigthofcylinder;
		double result1=2*3.24*radiusofcylinder*(radiusofcylinder+heigthofcylinder);
		double cube=6*Math.pow(sidesofcube, 2);
		
		System.out.print("Curved Surface Area of Cylinder : "+result);
		System.out.println();
		System.out.print("Total Curved Surface Area of Cylinder : "+result1);
		System.out.println();
		System.out.print("Total Curved Surface Area of Cube : "+cube);
		s.close();
	}
}
