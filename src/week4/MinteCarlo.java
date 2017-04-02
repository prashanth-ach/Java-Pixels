package week4;

import java.util.Scanner;

public class MinteCarlo {

	public static void main(String[] args) {
		long noOfTrials = 1000;
		int noOfOrders = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter our how many iterations ");
		System.out.print(" from 1 to 10^8 : ");
		noOfOrders = input.nextInt();
		for (int count = 1; count <= noOfOrders; count++) {
			int numberOfHits = 0;
			double pi = 0;
			for (int i = 0; i < noOfTrials; i++) {
				double x = (Math.random() * 2.0 - 1);
				double y = (Math.random() * 2.0 - 1);
				if (x * x + y * y <= 1)
					numberOfHits++;
			}
			pi = 4.0 * numberOfHits / noOfTrials;
			System.out.print(count + " :PI is " + pi + " with " + noOfTrials + " random points");

			noOfTrials = noOfTrials * 10;
			input.close();
		}
	}
}
