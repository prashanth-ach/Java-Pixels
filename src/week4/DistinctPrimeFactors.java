package week4;

import java.util.LinkedList;

public class DistinctPrimeFactors {
	
	 
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<Integer> threefactors = new LinkedList<Integer>();
		    int n = 0;
		    while (true)
		    {
		        n++;
		        int factcount = 0;
		        for (int i = 1; i <= n; i++)
		        {
		            if (n % i == 0 && isPrime(i))
		                factcount++;
		        }
		        if (factcount == 4)
		        {
		            threefactors.addLast(n);
		            int lastn = (n - 1);
		            int lastn2 = (n - 2);
		            int lastn3 = (n - 3);
		            if (threefactors.contains(lastn)  && threefactors.contains(lastn2) && threefactors.contains(lastn3))
		            {
		                System.out.println(n);
		                System.out.println(lastn);
		                System.out.println(lastn2);
		                System.out.println(lastn3);
		                break;
		            }
		        }
		    }
		}
		public static boolean isPrime(int n)
		{
		    if (n == 1)
		        return false;
		    if (n == 2)
		        return true;
		    for (int i = 2; i < n; ++i)
		    {
		        if ((n % i) == 0)
		            return false;
		    }
		    return true;
		}

	}


