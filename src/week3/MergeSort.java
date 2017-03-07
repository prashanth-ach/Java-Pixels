package week3;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[4];
		int temp=0,tem=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<4;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length/2;i++)
{
if(a[i]>a[i+1])
{
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
}
}
for(int i=a.length/2;i<a.length-1;i++)
{
if(a[i]>a[i+1])
{
	tem=a[i];
	a[i]=a[i+1];
	a[i+1]=tem;
}
}
for(int i=0;i<a.length-1;i++)
{
	if(a[i]>a[i+1])
	{
		temp=0;
		tem=a[i];
		a[i]=a[i+1];
		a[i+1]=tem;
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
sc.close();
	}

}
