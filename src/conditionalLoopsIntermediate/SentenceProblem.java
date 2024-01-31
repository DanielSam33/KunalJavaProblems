package conditionalLoopsIntermediate;

import java.util.Scanner;

public class SentenceProblem {

	public static void main(String[] args) {
		int days=1;
		for(days=1;days<=31;days++) {
			if(days%2==0) {
				System.out.print(days+" ");
			}
		}
		System.out.println();
		System.out.print("15 days");
	}
}
