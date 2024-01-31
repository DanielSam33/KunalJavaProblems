package firstProgram;

import java.util.Scanner;

public class PailndromeString {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String input=s.next();
		String reverse="";
		char alt[]=input.toCharArray();
		for(int i=alt.length-1;i>=0;i--) 
			reverse=reverse+input.charAt(i);
			if(input.equals(reverse)) 
				System.out.println("It is a Palindrome!!");
			else 
				System.out.println("Not an Palindrome");
		s.close();
}
}