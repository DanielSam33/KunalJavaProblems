package conditionalLoopsEasy;

import java.util.Scanner;

public class VolumeOfCone_Cylinder_Sphere {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		double pi=3.14;
		System.out.print("Enter the Size Of Radius for Cone : ");
		double radiusofcone=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Height of the Cone : ");
		double heightofcone=s.nextDouble();
		System.out.println();
		
		System.out.print("Enter the Size Of Radius for Cylinder : ");
		double radiusofcylinder=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Height of the Cylinder : ");
		double heightofcylinder=s.nextDouble();
		System.out.println();
		
		System.out.print("Enter the Size of Radius for Sphere : ");
		double radiusofsphere=s.nextDouble();
		System.out.println();
		
		System.out.println("Here Comes the Result!!!!");
		double volumeofcone=pi*(radiusofcone*radiusofcone)*heightofcone/3;
		double volumeofcylinder=pi*(radiusofcylinder*radiusofcylinder)*heightofcylinder;
		double volumeofsphere=(pi*(Math.pow(radiusofsphere, 3)))*4/3;
		System.out.print("Volume of Cone : "+volumeofcone);
		System.out.println();
		System.out.print("Volume of Cylinder : "+volumeofcylinder);
		System.out.println();
		System.out.print("Volume of Sphere : "+volumeofsphere);
		s.close();
	}
}
