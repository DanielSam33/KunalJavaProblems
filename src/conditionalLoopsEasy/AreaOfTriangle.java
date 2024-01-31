package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Breadth : ");
		double breadth=s.nextDouble();
		System.out.println("Enter the Heigth : ");
		double heigth=s.nextDouble();
		
		double ans=(breadth*heigth)*1/2;
		System.out.println("Arra of Triangle : "+ans);
		
	}
}
