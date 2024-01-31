package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length : ");
		double length=s.nextDouble();
		System.out.println("Enter the Width : ");
		double width=s.nextDouble();
		
		System.out.println("Area of Rectangle : "+(length*width));
		
		}
}
