package week2;

import java.math.BigInteger;

public class FibonociIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3 = BigInteger.ZERO;
		BigInteger p = BigInteger.ZERO;
		BigInteger i = BigInteger.ZERO;

		do {

			n3 = n1.add(n2);
			System.out.println(n3);
			char[] x = String.valueOf(n3).toCharArray();

			n1 = n2;
			n2 = n3;
			i = i.add(BigInteger.ONE);
			p.equals(x.length);
		} while (p.compareTo(p) <= 3);
		// System.out.println(n3);
		System.out.println(".................................");
		System.out.println(i);
	}

}
