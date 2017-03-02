package week1;

import java.util.Scanner;

class Fibono {
	public static void main(String args[]) {
		int n1 = 1, n2 = 1, n3, i;
		System.out.println("enter limit");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(n1 + " " + n2);
		for (i = 2; i < n; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		s.close();
	}
}
