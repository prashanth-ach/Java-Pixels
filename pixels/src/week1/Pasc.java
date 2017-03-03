package week1;

import java.util.Scanner;

public class Pasc {

	public static void print(int n) {
		int[] p;
		int[] c = { 1 };

		prnt(c);

		p = c;

		for (int i = 2; i <= n; i++) {
			c = new int[i];
			c[0] = 1;
			c[i - 1] = 1;

			for (int j = 0; j <= i - 3; j++) {
				c[j + 1] = p[j] + p[j + 1];
			}

			prnt(c);

			p = c;
		}
	}

	public static void prnt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows: ");

		int r = scanner.nextInt();

		print(r);
		scanner.close();
	}
}
