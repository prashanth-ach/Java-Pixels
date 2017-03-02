package week2;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BigInteger t =new BigInteger("600851475143");

		long n = 600851475143L;

		for (long i = 2; i < n; ++i) {
			while (n % i == 0) {
				n = n / i;

			}

		}
		System.out.println(n);
	}

}
