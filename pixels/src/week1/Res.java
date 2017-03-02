package week1;

//prime number
import java.util.Scanner;

public class Res {
	boolean prim = true;

	public void check(int p) {
		for (int i = 2; i <= p / 2; i++) {

			if ((p % i) == 0) {
				prim = false;
				break;
			}
		}
		if (prim)
			System.out.println(" is Prime Number");
		else
			System.out.println(" is not Prime Number");

	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int n = scan.nextInt();
		Res r = new Res();
		r.check(n);
		scan.close();
	}
}
