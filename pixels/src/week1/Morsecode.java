package week1;

import java.util.Scanner;

public class Morsecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " " };

		String[] d = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
				"---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|" };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter message to read:");
		String n = scan.nextLine();

		String[] strgs = n.split(" ");

		for (int i = 0; i < strgs.length; i++) {
			String s = strgs[i];
			String[] r = s.split("(?!^)");

			for (int j = 0; j < r.length; j++) {
				for (int k = 0; k < a.length; k++) {
					if (r[j].equals(a[k])) {
						System.out.print(d[k]);
					}
				}

			}

			System.out.print("\t");

		}
		scan.close();
	}

}
