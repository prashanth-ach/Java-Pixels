package week1;

import java.util.Scanner;

public class Fact {

	public static void main(String args[]) {
		int i;
		int p = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int n = scan.nextInt();
		if (n != 1) {
			for (i = 1; i <= n; i++) {
				p = p * i;
			}
			System.out.println("Factorial of " + n + " is: " + p);
		}

		else {
			System.out.println("Factorial of " + n + " is : 0");
		}
		scan.close();
	}
}