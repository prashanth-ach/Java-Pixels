package tasks;

import java.util.Scanner;

public class Swap {
	Scanner s = new Scanner(System.in);

	public void begin() {
		System.out.println("Enter\n 1:using temp \n 2:using no temp");
		int n = s.nextInt();

		if (n == 1) {
			with();
		} else if (n == 2) {
			without();
		} else {
			begin();

		}

	}

	public void with() {
		System.out.println("enter 2 numbers");
		int n = s.nextInt();
		int m = s.nextInt();
		int l;
		l = n;
		n = m;
		m = l;
		System.out.println("n:" + n + "m:" + m);
	}

	public void without() {
		System.out.println("enter 2 numbers");
		int n = s.nextInt();
		int m = s.nextInt();
		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println("n:" + n + "m:" + m);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Swap s = new Swap();
		s.begin();

	}

}
