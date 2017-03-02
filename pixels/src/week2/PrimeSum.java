package week2;

import java.util.Scanner;

class PrimeSum {

	public void checkin(int l) {
		int sum = 0;
		for (int p = 2; p <= l; p++) {
			boolean prim = true;
			for (int i = 2; i <= Math.sqrt(p); i++) {
				if ((p % i) == 0) {
					prim = false;
					break;
				}
			}
			if (prim) {
				sum = sum + p;
			}

		}
		System.out.println(sum);
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range");
		int n = scan.nextInt();
		PrimeSum r = new PrimeSum();
		r.checkin(n);
		scan.close();
	}
}
