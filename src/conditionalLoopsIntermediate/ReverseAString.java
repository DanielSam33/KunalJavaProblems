package conditionalLoopsIntermediate;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Input : ");
		String input=s.next();
		
		System.out.println();
		StringBuffer reverse=new StringBuffer(input);
		System.out.print("Output : "+reverse.reverse());
		s.close();
	}
}
