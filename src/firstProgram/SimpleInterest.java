package firstProgram;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount : ");
		double principal=s.nextDouble();
		System.out.println();
		System.out.print("Enter the Time Period(in Years) : ");
		float time=s.nextFloat();
		System.out.println();
		System.out.print("Enter the Rate of Interest(in Years) : ");
		float interest=s.nextFloat();
		
		System.out.println();
		double SI=(principal*time*interest)/100;
		System.out.println("Simple Interest : "+SI);
		s.close();
	}
}
