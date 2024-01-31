package firstProgram;

import java.util.Scanner;

public class GreetingMessage {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name=s.next();
		
		System.out.println("Welcome to our Home "+name+"!!!!");
		s.close();
	}
}
