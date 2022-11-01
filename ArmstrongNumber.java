package baisccodingproblems;

import java.util.Scanner;

//Check if the given number is an Armstrong number or not.

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		
		int temp, digits=0, sum=0, last=0;
		temp =n;
		
		//logic to find the number of digits in a given number
		while(temp>0) {
			temp =temp/10;
			digits++;
			//when temp becomes 0, loop ends.
		}
		
		temp =n;
		//login to calculate the sum of all digits with power of no.of digits
		while(temp>0) {
			last = temp%10;
			sum = (int) (sum + Math.pow(last, digits));
			temp = temp/10; //removes the last element 
		}
		
		if(n==sum) {
			System.out.println("The number "+n+" is an armstrong number");
		}else {
			System.out.println("The number "+n+" is not an armstrong number.");
		}

	}

}
