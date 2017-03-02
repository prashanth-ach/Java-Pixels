package mypackage;

public class WordsThouSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 3, 3, 5, 4, 4, 3, 5, 5, 4 };
		int p, j = 0, l;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			l = i;
			while (l > 0) {
				j = l % 10;
				l = l / 10;

				p = j;

				sum = sum + a[p];

			}
		}

		System.out.println(sum);
	}

}
