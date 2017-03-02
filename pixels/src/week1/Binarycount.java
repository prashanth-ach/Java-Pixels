package week1;

import java.util.Scanner;

public class Binarycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("enter a number : ");

		int num = in.nextInt();
		int j = 0;
		StringBuffer br = new StringBuffer();
		while (num >= 1) {
			if (num % 2 != 0) {
				br.append(1);
			} else if (num % 2 == 0) {
				br.append(0);
			}
			num = (num / 2);
		}

		String str = br.reverse().toString();
		System.out.println(str);
		char[] x = str.toCharArray();

		for (int i = x.length - 1; i >= 0; i--) {
			if (x[i] == '1')
				;
			{
				j++;
			}
		}

		System.out.println(j);
		in.close();

	}

}
