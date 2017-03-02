package tasks;

import java.math.*;

import java.util.Scanner;

public class Bigfact {

	public static void main(String args[]) {
		BigDecimal i;
		BigDecimal p = BigDecimal.ONE;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		BigDecimal n = scan.nextBigDecimal();
		if (n != BigDecimal.ONE) {
			for (i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
				p = p.multiply(i);
			}
			System.out.println("Factorial of " + n + " is: " + p);
		}

		else {
			System.out.println("Factorial of " + n + " is : 0");
		}
		scan.close();
	}
}