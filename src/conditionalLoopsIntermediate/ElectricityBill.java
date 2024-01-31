package conditionalLoopsIntermediate;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the Number Of Units : ");
		int unit=s.nextInt();
		System.out.print("Select the Purpose : ");
		System.out.println();
		System.out.println("1.Home \t 2.Commercial");
		String purpose=s.next();
		System.out.println();
		
		switch(purpose) {
		case "1":
			int home=30;
			System.out.print("The Electricity Bill is "+(unit*home)+" Rupees!!");
			System.out.println();
			System.out.println("Unit Charges for Home Purpose is 30 Rupees");
			break;
		
		case "2":
			int commercial=60;
			System.out.print("The Electricity Bill is "+(unit*commercial)+" Rupees!!");
			System.out.println();
			System.out.println("Unit Charges for Commercial Purpose is 60 Rupees");
			break;
			
		case "Home":
			int home1=30;
			System.out.print("The Electricity Bill is "+(unit*home1)+" Rupees!!");
			System.out.println();
			System.out.println("Unit Charges for Home Purpose is 30 Rupees");
			break;
			
		case "Commercial":
			int commercial1=60;
			System.out.print("The Electricity Bill is "+(unit*commercial1)+" Rupees!!");
			System.out.println();
			System.out.println("Unit Charges for Commercial Purpose is 60 Rupees");
			break;
			
		default :
			System.out.print("It is an Invalid Input!!");
			break;
		}		
	}
}
