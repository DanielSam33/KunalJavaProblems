package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Heigth : ");
		double heigth=s.nextDouble();
		System.out.println("Enter the Length : ");
		double length=s.nextDouble();
		
		double ans=(length*heigth)/2;
		System.out.println("Area of Rhombus : "+ans);
	}
}
