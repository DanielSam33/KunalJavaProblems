package conditionalLoopsEasy;

import java.util.Scanner;

public class VolumeOfPrism_Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Breadth of Prism : ");
		double breadthofprism=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Heigth of Prism : ");
		double heigthofprism=s.nextDouble();
		System.out.println();
		
		System.out.print("Enter the Width of Pyramid : ");
		double widthofpyramid=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Heigth of Pyramid : ");
		double heigthofpyramid=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Length of Pyramid : ");
		double lenofpyramid=s.nextDouble();
		System.out.println();
		
		System.out.println("Here Comes the Result!!!!");
		double volofprism=breadthofprism*heigthofprism;
		double volofpyramid=lenofpyramid*widthofpyramid*heigthofpyramid/3;
		System.out.print("Volume of Prism : "+volofprism);
		System.out.println();
		System.out.print("Volume of Pyramid : "+volofpyramid);
		
	}
}
