package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeDigitPalindrome {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Integer> m = new ArrayList<>();
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {

				int a = 0;
				a = i * j;

				String s = Integer.toString(a);
				char[] x = String.valueOf(a).toCharArray();
				String l = new StringBuffer(s).reverse().toString();
				char[] p = l.toCharArray();
				if (Arrays.equals(x, p)) {
					m.add(a);

				}
			}

		}
		System.out.println(Collections.max(m));
	}

}