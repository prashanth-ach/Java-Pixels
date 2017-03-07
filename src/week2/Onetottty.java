package week2;

public class Onetottty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aa:for (int i = 2520;; i++) {
			int count = 0;
			for (int j = 1; j <= 20; j++) {
				if (i % j == 0) {
					count++;
					if (count == 20) {
						System.out.println(i);
						break aa;
					}

				}
			}
		}
	}

}
