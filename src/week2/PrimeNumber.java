package week2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;

		for (int p = 2; p < 10000000; p++) {
			boolean isPrime = true;
			for (int f = 2; f < p; f++) {

				if (p % f == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				j = p;
				i++;
			}
			if (i == 10001) {
				break;
			}
		}
		System.out.println(j);

	}

}
