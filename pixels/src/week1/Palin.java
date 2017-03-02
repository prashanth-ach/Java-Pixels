package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		String n = scan.nextLine();
		char[] x = n.toCharArray();
		String l = new StringBuffer(n).reverse().toString();
		char[] p = l.toCharArray();
		if (Arrays.equals(x, p)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		scan.close();

	}

}
