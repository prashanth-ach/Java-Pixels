package week3;

public class UnitFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, k, max, j, val = 0, z;
		max = 0;
		for (i = 7; i < 1000; i++) {
			j = 0;
			k = 10 % i;
			z = 1000;
			while (k != 1 && z > 0) {
				k = k * 10;
				k = k % i;
				j++;
				z--;
			}
			if (j > max && z > 1) {
				max = j;
				val = i;
			}
		}
		System.out.println("max value:" + val);

	}

}
