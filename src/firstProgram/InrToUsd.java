package firstProgram;
import java.util.Scanner;

public class InrToUsd {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("INR & USD Currency Converter");
	    System.out.println("Enter the Currency :");
	    System.out.println("1.USD \t 2.INR");
	    double currency=s.nextInt();
	    System.out.println("How much money Do you want to exchange : ");
	    double input=s.nextDouble();
	    
	    if(currency==1) {
	    	double result=input*74.42;
	    	System.out.println("The Currency value of "+input+" USD is "+result+" Rupees!!");
	    	System.out.println("Today 1 USD = 74.42 Rupees");
	    }
	    else if(currency==2){
	    	double result=input/74.42;
	    	System.out.println("The Currency value of "+input+" INR is "+result+" Dollars!!");
	    	System.out.println("Today 1 Rupees = 0.012 USD");
	    }
	  s.close(); 
		}
}
