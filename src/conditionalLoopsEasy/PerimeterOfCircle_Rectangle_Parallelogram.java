package conditionalLoopsEasy;

import java.util.Scanner;

public class PerimeterOfCircle_Rectangle_Parallelogram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Radius Of Circle : ");
		double radius=s.nextDouble();
		System.out.println();
		
		System.out.print("Enter the Length Of Rectangle: ");
		double lenOfRectangle=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Breadth Of Rectangle : ");
		double breadthOfRectangle=s.nextDouble();
		System.out.println();
		
		System.out.print("Enter the Base Of Parallelogram : ");
		double baseOfParallelogram=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Heigth Of Parallelogram : ");
		double heigthOfParallelogram=s.nextDouble();
		System.out.println();
		
		System.out.println("Here Comes the Result!!!!!");
		
		double periOFCircle=2*3.14*radius;
		System.out.println("Perimeter Of Circle : "+periOFCircle);
		System.out.println();
		double periOFRectangle=2*(lenOfRectangle+breadthOfRectangle);
		System.out.println("Perimeter Of Rectangle : "+periOFRectangle);
		System.out.println();
		double periOFParallelogram=2*(baseOfParallelogram+heigthOfParallelogram);
		System.out.println("Perimeter Of Parallelogram : "+periOFParallelogram);
		
		s.close();
	}
}
