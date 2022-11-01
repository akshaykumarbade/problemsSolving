package baisccodingproblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n; // store given number in temp to compare later.
		int r, sum=0;
		
		//logic to reverse the number
		while(n>0) {
			r=n%10;//getting remainder here
			sum= (sum*10)+r; 
			n=n/10;
			
		}
		
		if(temp == sum) {
			System.out.println(temp+" is a palindrome");
		}else {
			System.out.println(temp+ " is not a palindrome");
		}
		
		sc.close();
		
	}

}
