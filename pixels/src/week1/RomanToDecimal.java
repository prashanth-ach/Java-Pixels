package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RomanToDecimal {
	public void Decimal() throws IOException
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number");	   
	    String num=in.readLine();
	    char pos[]={'0','I','V','X','L','C','D','M'};   
	    int l1=7;                          
	    String v[]={"","1","5","10","50","100","500","1000"};
	    int l=num.length();
	    int p=0,p1=0,sum=0;

	    for(int i=l-1;i>=0;i--)
	    {
	        char ch=num.charAt(i);
	        for(int j=1;j<=l1;j++)
	        {
	            if(ch==pos[j])
	            p=j;
	        }
	        if(p>=p1)
	            sum+=Integer.parseInt(v[p]);
	        else
	            sum-=Integer.parseInt(v[p]);
	 
	            p1=p;
	    }
	    System.out.println(sum);
	    in.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RomanToDecimal r=new RomanToDecimal();
		r.Decimal();

	}

}
