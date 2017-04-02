package week4;

import java.math.BigInteger;

public class PowerfulDigitSum {
	public void run() {
		int max = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger pow = BigInteger.valueOf(a).pow(b);
				max = Math.max(digitSum(pow), max);
			}
		}
	System.out.println(Integer.toString(max));
	}
	
	
	private static int digitSum(BigInteger n) {
		int sum = 0;
		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerfulDigitSum p=new PowerfulDigitSum();
		p.run();
	}

}
