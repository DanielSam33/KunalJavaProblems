package conditionalLoopsIntermediate;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Number Of Runs Scored : ");
		int runs=s.nextInt();
		System.out.print("Number of Innings Played : ");
		int innings=s.nextInt();
		
		System.out.println();
		float result=runs/innings;
		System.out.print("The Batting Average : "+result);
		s.close();
	}

}
