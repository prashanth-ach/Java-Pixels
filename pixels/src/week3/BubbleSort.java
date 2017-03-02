package week3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		int k;
		 System.out.println("Enter array size");
	     k = scan.nextInt();
		int[] arr=new int[k];
		int n = arr.length;
		int temp = 0;
		System.out.println("enter the elements");
		for(int i=0; i < n; i++)
		{
		arr[i]=scan.nextInt();
		}

		for(int i=0; i < n; i++){
		   for(int j=1; j < (n-i); j++){                        
		       if(arr[j-1] > arr[j]){
		            //swap the elements!
		            temp = arr[j-1];
		            arr[j-1] = arr[j];
		            arr[j] = temp;
		       }                    
		   }
		}
		for(int i=0; i < n; i++){
			System.out.print("sorted:"+arr[i]+"\t");
		}
		scan.close();

	}

}
