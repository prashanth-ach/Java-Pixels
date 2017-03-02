package week2;

public class SumofEvenFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, j = 1, sum = 0;
		while (i < 4000000) {
			i = i + j;
			j = i - j;
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("sum:" + sum);

	}

}
