package baisccodingproblems;

import java.util.Scanner;

// if the sum of all factors of a number is equal to number itself then that number is a perfect number.
// e.g. number is 6 . factors 1,2,3=6
// 28 ,   factors 1,2,14,4,7= 28
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum =sum+i;
			}
		}
		
		if(sum==n) {
			System.out.println("The number "+n+" is a perfect number");
		}else {
			System.out.println(("The number "+n+" is not a perfect number"));
		}
		sc.close();

	}

}
