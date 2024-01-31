package conditionalLoopsIntermediate;

import java.util.Scanner;

public class DiscountOfProduct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Price : ");
		double price=s.nextDouble();
		System.out.println();
		System.out.print("Discount Percentage : ");
		double dis=s.nextDouble();
		double result=price-(dis/100)*price;
		System.out.println();
		System.out.println("Final Price After Discount is "+result+" Rupees!!");
		s.close();
	}
}
