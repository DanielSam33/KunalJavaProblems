package firstProgram;

import java.util.Scanner;

public class OddOrEven {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num=s.nextInt();
	
		if(num%2==0) {
			System.out.println("It is Even Number");
		}
		else  {
			System.out.println("It is an Odd Number");
			}
		s.close();
	}	
}

