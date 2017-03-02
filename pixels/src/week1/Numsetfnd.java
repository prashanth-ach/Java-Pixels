package week1;

import java.util.Scanner;

public class Numsetfnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] y = { "1", "31", "45", "67", "99", "22", "56", "67" };
		System.out.println("Enter a number for check:");
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();

		for (int i = 0; i < y.length; i++) {
			if (n.equals(y[i])) {
				System.out.println("found");

			}

		}

		scan.close();

	}
}