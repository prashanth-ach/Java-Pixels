
package week2;
/*Evaluate the sum of all the amicable numbers under 10000.*/

public class AmicableNumbers {

	public static void main(String[] args) {

		int num = 10000;
		int num1 = 0, number2 = 0;
		int totalsum = 0;
		for (int i = 1; i <= num; i++) {
			num1 = i;
			int rem = 0;
			int fact1 = 0, fact2 = 0;
			int sum1 = 0, sum2 = 0;
			for (int j = 1; j < num1; j++) {
				rem = num1 % j;
				if (rem == 0) {
					fact1 = j;
					sum1 = sum1 + fact1;
				}
			}
			if (sum1 != num1) {
				number2 = sum1;
				for (int j = 1; j < number2; j++) {
					rem = number2 % j;
					if (rem == 0) {
						fact2 = j;
						sum2 = sum2 + fact2;
					}
				}

				if (num1 == sum2) {
					System.out.println(sum1 + "--" + sum2);
					totalsum = totalsum + (sum1 + sum2);

				}
			}
		}
		System.out.println("total sum is:" + totalsum);
	}

}
