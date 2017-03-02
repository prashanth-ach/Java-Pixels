package mypackage;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {7,9,5,6,8}; 
		    int min = 0;

		    for(int i = 0;i<arr.length;i++)
		    {
		        min = i;
		        for(int j = i + 1;j<arr.length;j++)
		        {
		            if(arr[j] < arr[min]) { min = j;}
		        }
		        int temp = arr[i];
		        arr[i] = arr[min];
		        arr[min] = temp;
		        System.out.println(arr[i]);

	}

}
}
