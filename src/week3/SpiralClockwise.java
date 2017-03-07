package week3;

public class SpiralClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q=0,l=1,sum=1;
		
	for(int i=0;i<500;i++)
	{
		int p=0;
		q+=2;
		while(p<4)
		{
			l=l+q;
			sum=sum+l;
			//System.out.println(l);
			p++;
			
		}
	}
	System.out.println(sum);

	}

}
