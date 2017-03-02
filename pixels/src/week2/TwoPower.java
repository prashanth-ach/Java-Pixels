package mypackage;

import java.math.BigInteger;
import java.util.Scanner;

public class TwoPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger i;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		BigInteger n = scan.nextBigInteger();

		i = n.pow(1000);
		String s = i.toString();

		int sum = 0;

		for (int j = 0; j < s.length(); j++) {
			int digit = (int) (s.charAt(j) - '0');
			sum = sum + digit;
		}

		System.out.println(sum);

		scan.close();

	}

}
