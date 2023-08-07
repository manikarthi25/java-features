package com.manikarthi25.programs;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

		int temp = 0, n1 = 1, n2 = 1;

		System.out.println("Enter any number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			System.out.print(n1 + " " + n1 + " ");
			
			while (temp <= n) {
				temp = n1 + n2;
				
				if(temp > n)
					break;
				System.out.print(temp + " ");

				n1 = n2;
				n2 = temp;
			}
		}

	}

}

//Enter any number : 10
//1 1 2 3 5 8 