package baisccodingproblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int m=n/2;
		int flag=0; 
		
		if(n<=1) {
			System.out.println(n+" is not a prime number");
		}
		
		for(int i=2; i<m; i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				flag=1; //if number is not prime then we set flag to 1;
			}
		}
		
		// if flag remains 0 that means number is prime.
		if(flag==0) {
			System.out.println(n+" is a prime number");
		}
		
		sc.close();
		

	}
	

}
