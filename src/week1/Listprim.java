package week1;

//prime number list
import java.util.Scanner;

public class Listprim {

	public void checkin(int l) {

		for (int p = 2; p <= l; p++) {
			boolean prim = true;
			for (int i = 2; i <= p / 2; i++) {
				if ((p % i) == 0) {
					prim = false;
					break;
				}
			}
			if (prim)

				System.out.println(p);

		}
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range");
		int n = scan.nextInt();
		Listprim r = new Listprim();
		r.checkin(n);
		scan.close();
	}
}
