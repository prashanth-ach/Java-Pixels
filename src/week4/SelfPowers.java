package week4;

import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = BigInteger.ZERO;
        for(int x = 1; x <= 1000; x++){
            BigInteger exp = new BigInteger("" + x).pow(x);
            sum = sum.add(exp);
        }
         
        String output = sum.toString();
        System.out.println(output.substring(output.length() - 10, output.length()));

	}

}
