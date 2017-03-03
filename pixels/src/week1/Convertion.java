package week1;

import java.util.Scanner;

public class Convertion {

	public void conver(String s) {
		String[] strgs = s.split(" ");

		for (int i = 0; i < strgs.length; i++) {
			String p = strgs[i];
			char[] x = p.toCharArray();
			char[] l = new char[(x.length) + 2];
			l[l.length - 1] = 'y';
			l[(l.length) - 2] = 'a';
			l[(l.length) - 3] = x[0];

			for (int j = 0; j < (l.length) - 3; j++) {
				l[j] = x[j + 1];

			}
			String newString1 = new String(l);
			System.out.print(newString1 + "\t");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range");
		String n = scan.nextLine();
		Convertion r = new Convertion();
		r.conver(n);

		scan.close();
	}

}
