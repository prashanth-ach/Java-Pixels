package week2;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;

		int s1 = 0;

		int s2 = 0;

		int output = 0;

		s1 = (n * (n + 1)) / 2;

		s2 = (n * (n + 1) * ((2 * n) + 1)) / 6;

		output = (s1 * s1) - s2;

		System.out.println(output);

	}

}
