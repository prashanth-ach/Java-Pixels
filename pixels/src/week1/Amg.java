package tasks;

import java.util.Scanner;

public class Amg {
	public static void main(String[] args) {
		int c = 0, a, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int n = scan.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
		scan.close();
	}
}