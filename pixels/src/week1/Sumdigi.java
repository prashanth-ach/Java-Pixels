package week1;

import java.util.Scanner;

class Sumdigi

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter a number : ");
		int n = scan.nextInt();
		int num = 0, sum = 0;
		while (n != 0) {
			num = n % 10;
			sum = sum + num;
			n = n / 10;
		}
		System.out.println("\nSum is : " + sum);
		scan.close();
	}
}