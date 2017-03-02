package week2;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int x = 2;
		boolean found = false;
		while (!found) {
			if (divisors(i) > 500) {
				System.out.println(i);
				found = true;
			} else {
				i += x;
				x++;
			}
		}
	}

	public static int divisors(int n) {

		int counter = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0)
				counter++;
		}
		return counter;

	}

}
