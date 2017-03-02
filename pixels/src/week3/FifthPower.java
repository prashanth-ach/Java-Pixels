package week3;

public class FifthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,sum=0,l;
		long n=0;
		for(int i=1632;i<=1000000;i++)
		{
		l=0;
		l=i;
		sum=0;
		while (l > 0) 
		{
		    p= l % 10;
		    sum+=Math.pow(p, 5);
		    l = l / 10;
		    
		}
		
		if(i==sum)
		{
			//System.out.println(i);
			n+=sum;
		}
		}
		System.out.println(n);
	}

}
