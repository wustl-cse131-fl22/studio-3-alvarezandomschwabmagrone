package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter the maximum: ");
		n = in.nextInt();
		in.close();
		
		boolean[]isPrime = new boolean[n];
		for(int i = 1; i < n; i++) {
			isPrime[i] = true;
		}
		
			for(int i = 2; i <= n; i++) {
				if (isPrime[i-1] == true) {

					
					System.out.println(i);
					
					for (int x = i*i; x <= n; x+= i) {
						isPrime [x-1] = false;
					}
					

				}
				
			}
		

		
		
	}

}
