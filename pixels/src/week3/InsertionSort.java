package mypackage;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );        

        int n, i;
        System.out.println("Enter array size");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int  j, temp;
        for (i = 1; i<arr.length; i++) 
        {
            j = i;
            temp = arr[i];    
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
  
       
        System.out.println("Elements after sorting ");        
        for (i = 0; i < n; i++)
        System.out.print(arr[i]+"\t");            
        System.out.println();  
        scan.close();

	}

}
