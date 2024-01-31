package conditionalLoopsEasy;

import java.util.Scanner;

public class SubtractTheProductAndSumOfAnIntegerLeetcode {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input : ");
		int n=s.nextInt();
		 int rem=0,sum=0,product=1,result=0;
		    while(n>=1 && n<=100000)
		    {
		        rem=n%10;
		        sum=sum+rem;
		        product=product*rem;
		        result=product-sum;
		        n=n/10;
		    }
		        System.out.println("The Answer : "+result);
		        s.close();
	}
}
