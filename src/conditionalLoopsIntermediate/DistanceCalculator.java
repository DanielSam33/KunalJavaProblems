package conditionalLoopsIntermediate;

import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Co-ordinates Of Point A : ");
		int x1=s.nextInt();
		int y1=s.nextInt();
		System.out.println();
		System.out.print("Enter the Co-ordinates Of Point A : ");
		int x2=s.nextInt();
		int y2=s.nextInt();
		
		double distance=Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
		System.out.println(distance);
		s.close();	
		}
	}
