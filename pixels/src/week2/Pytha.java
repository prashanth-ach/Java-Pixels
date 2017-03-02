package mypackage;

public class Pytha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1000;

		for (int a = 1; a <= sum / 3; a++) {

			for (int b = a + 1; b <= sum / 2; b++) {
				int c = sum - a - b;

				if (a * a + b * b == c * c)

					System.out.println("numbers\t" + a + "  " + b + "  " + c);
			}
		}

	}

}
