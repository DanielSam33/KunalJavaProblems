package conditionalLoopsIntermediate;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the English Marks : ");
		int english=s.nextInt();
		System.out.print("Enter the Tamil Marks : ");
		int tamil=s.nextInt();
		System.out.print("Enter the Math Marks : ");
		int math=s.nextInt();
		System.out.print("Enter the Science Marks : ");
		int science=s.nextInt();
		System.out.print("Enter the Social Science Marks : ");
		int social=s.nextInt();
		
		System.out.println();
		float percent=(english+tamil+math+science+social)/5;
		System.out.print("Average Marks : "+percent);
		s.close();
	}
}
