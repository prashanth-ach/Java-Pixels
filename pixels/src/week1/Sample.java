package week1;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long testNum = 600851475143l;
		int largestFactor = 0;
		long loopMax = 17425170l; // largest known prime
		for (int i = 3; i * i <= loopMax; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && testNum % i == 0) {
				System.out.println("prime factor: " + i);
				largestFactor = i;
				loopMax = (testNum / i) + 1;
			}
		}
		System.out.println("result is: " + largestFactor);

	}

}
