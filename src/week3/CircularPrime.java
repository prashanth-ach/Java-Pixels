package week3;

import java.util.BitSet;

public class CircularPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 1000000;

		BitSet prime = new BitSet(limit + 1);

		int i, j;

		int n;

		int c = 0;

		boolean isPrime;

		String number;

		for (i = 2; i <= limit; i++) {

			if (!prime.get(i)) {

				for (j = 2; i * j <= limit; j++)

					prime.set(i * j);

			}

		}

		for (n = 2; n < limit; n++) {

			number = Integer.toString(n);

			isPrime = true;

			for (i = 0; i < number.length(); i++) {

				if (prime.get(Integer.parseInt(number.substring(1)

						+ number.charAt(0)))) {

					isPrime = false;

					break;

				} else

					number = number.substring(1) + number.charAt(0);

			}

			if (isPrime)

				c++;

		}

		System.out.println("Total number of circular prime is: " + c);

	}

}
