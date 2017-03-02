package week1;

import java.util.Scanner;

public class Bin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a number : ");

		int num = in.nextInt();

		StringBuffer br = new StringBuffer();
		while (num >= 1) {
			if (num % 2 != 0) {
				br.append(1);
			} else if (num % 2 == 0) {
				br.append(0);
			}
			num = (num / 2);
		}
		System.out.println(br.reverse());
		in.close();
	}

}
