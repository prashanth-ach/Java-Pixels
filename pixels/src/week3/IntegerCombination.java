package week3;

import java.math.BigInteger;
import java.util.ArrayList;

public class IntegerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i;int j;
		
		BigInteger b = null;
		BigInteger den =null;
		ArrayList<String> powers = new ArrayList<String>();
		for(i=2;i<=100;i++)
		{
			for(j=2;j<=100;j++)
			{
				den = BigInteger.valueOf(i);
				b = den.pow(j);
				powers.add(""+b);
			
			}
		}
		
		System.out.println("Number of elements:"+powers.size());

	}

}
