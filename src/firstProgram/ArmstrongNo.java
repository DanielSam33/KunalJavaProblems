package firstProgram;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int input=s.nextInt();
		int rem=0,sum=0,temp=input;
		String length=String.valueOf(input);
		int length1=length.length();
		while(input>0){
			 rem=input%10;
			 sum=(int)(sum+Math.pow(rem, length1));
			 input=input/10;
		}
		if(sum==temp) {
			System.out.println("It is an Armstrong Number!!");
		}
		else {
			System.out.println("It is not a Armstrong Number!!");
		}
		s.close();
	}

}
