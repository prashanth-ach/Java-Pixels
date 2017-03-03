package week1;

import java.util.Scanner;

public class Dectorom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = { " ", "x", "xx", "xxx", "xl", "l" };
		String[] y = { " ", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int n = scan.nextInt();
		int i = (n / 10) % 10;
		int j = n % 10;
		System.out.println("value :" + x[i] + y[j]);

		scan.close();
	}

}
