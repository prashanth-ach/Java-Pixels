package mypackage;

public class LongestChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		long num = 0;
		long result = 0;
		int chainSize = 0;

		for (long i = 2; i < 1000000; i++) {
			chainSize = 0;
			num = i;
			while (num != 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = 3 * num + 1;
				}
				chainSize++;
			}
			chainSize++;
			if (chainSize > max) {
				max = chainSize;
				result = i;
			}
		}

		System.out.println(result + " " + max);

	}

}
