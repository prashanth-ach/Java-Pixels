package week4;

public class PentagnalNumber {
	private boolean isPentagonal(int number) {
		double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
		return penTest == ((int) penTest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PentagnalNumber p = new PentagnalNumber();
		int result = 0;
		boolean notFound = true;
		int i = 1;

		while (notFound) {
			i++;
			int n = i * (3 * i - 1) / 2;

			for (int j = i - 1; j > 0; j--) {
				int m = j * (3 * j - 1) / 2;
				if (p.isPentagonal(n - m) && p.isPentagonal(n + m)) {
					result = n - m;
					System.out.println(result+"\t"+i+"\t"+j);
					notFound = false;
					break;

				}

			}
		}
	}
}
