package conditionalLoopsEasy;

import java.util.Scanner;

public class PerimeterOfSquare_Rhombus_EquilateralTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Sides of Square : ");
		double sideofsquare=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Size of Sides of Rhombus : ");
		double sideofRhombus=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Size of Length of Equilateral Triangle : ");
		double lengthofsidesoftriangle=s.nextDouble();
		System.out.println();
		
		System.out.println("Here Comes the Result!!!!");
		double perofsquare=4*sideofsquare;
		double perofrhombus=4*sideofRhombus;
		double perofequitriangle=3*lengthofsidesoftriangle;
		
		System.out.print("Perimeter of Square : "+perofsquare);
		System.out.println();
		System.out.print("Perimeter of Rhombus : "+perofrhombus);
		System.out.println();
		System.out.println("Perimeter of Equilateral Triangle :"+perofequitriangle);
		s.close();
		
	}
}
