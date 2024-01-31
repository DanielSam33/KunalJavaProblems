package conditionalLoopsIntermediate;

import java.util.Scanner;

public class AverageOFNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Number Of Inputs : ");
		int n=s.nextInt();
		int sum=0;
		int average=0;
		System.out.println("Enter the Numbers One By One -> ");
		
		for(int i=0;i<n;i++) {
			sum+=s.nextInt();
		}
		average=sum/n;
		System.out.print("Average = "+average);
		s.close();
	}
}
