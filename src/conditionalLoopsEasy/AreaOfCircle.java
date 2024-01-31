package conditionalLoopsEasy;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double radius=s.nextDouble();
		double pi=3.14;
		double ans=pi*(radius*radius);
		System.out.println("Area of Circle : "+ans);
		
		
	}
}
