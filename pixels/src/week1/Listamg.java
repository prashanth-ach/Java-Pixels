package tasks;

import java.util.Scanner;

public class Listamg {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int n = scan.nextInt();

		for (int i = 1; i < n; i++) {
			int c = 0, a, temp;
			temp = i;
			int p = i;
			while (p > 0) {
				a = p % 10;
				p = p / 10;
				c = c + (a * a * a);
			}
			if (temp == c) {
				int m = temp + 1;
				int l = temp + 1;
				c = 0;
				a = 0;
				while (l > 0) {
					a = l % 10;
					l = l / 10;
					c = c + (a * a * a);
				}
				if (m == c)
					System.out.println(temp + " " + m);
			}
		}
		scan.close();
	}

}
