package week1;

import java.util.Arrays;

public class Lng {

	public static void main(String[] args) {

		// for(long i=49000;i<160000;i++)
		long i = 156942;
		// {
		for (int j = 2; j < 7; j++) {

			long m;

			m = i * j;

			String a = Long.toString(i);
			char[] x = a.toCharArray();
			String b = Long.toString(m);
			char[] p = b.toCharArray();

			Arrays.sort(x);
			Arrays.sort(p);

			if (Arrays.equals(x, p)) {
				System.out.print(i);
			}
		}

		// }

	}

}
