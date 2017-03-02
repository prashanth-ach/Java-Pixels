package tasks;

import java.util.Scanner;

public class Plusminus {
	Scanner s = new Scanner(System.in);

	public void beg() {
		System.out.println("Enter\n 1:multiply \n 2:divide");
		int n = s.nextInt();

		if (n == 1) {
			wit();
		} else if (n == 2) {
			withou();
		} else {
			beg();

		}

	}

	public void wit() {
		System.out.println("enter 2 numbers");
		int n = s.nextInt();
		int m = s.nextInt();
		int l = 0;
		for (int i = 1; i <= m; i++) {
			l = l + n;
		}
		System.out.println(l);
	}

	public void withou() {
		System.out.println("enter 2 numbers");
		int n = s.nextInt();
		int m = s.nextInt();
		int l = 0;
		if (n >= m) {
			do {
				n = n - m;
				l++;
			} while (n >= m);
			System.out.println(l);
		} else

		{
			System.out.println("wrong input");
			withou();
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Plusminus s = new Plusminus();
		s.beg();

	}

}
