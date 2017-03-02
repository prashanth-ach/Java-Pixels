package week1;

//prime number list
import java.util.Scanner;

public class Listfact {

	public void checki(int l) {
		fac();
		int p = l;
		for (int i = 2; i <= p; i++) {
			if ((p % i) == 0) {
				System.out.println(i);
			}
		}

	}

	public void fac() {
		System.out.println("1");
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		Listfact r = new Listfact();
		r.checki(n);
		scan.close();

	}
}
