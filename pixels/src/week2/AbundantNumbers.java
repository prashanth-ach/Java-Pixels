package mypackage;

import java.util.ArrayList;

public class AbundantNumbers {

	public static void main(String[] args) {
		int limit = 28124;
	    int sum=0;
	    int tempNum;
	    int listSize;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    ArrayList<Integer> sumList = new ArrayList<Integer>();
	    for (int i=0; i<limit; i++) {

	        if (isAbundant(i)) {

	            list.add(i);
	        }
	    }
	    listSize = list.size();

	    for (int i=0; i<listSize; i++) {

	        for (int j=i; j<listSize; j++) {

	            tempNum = list.get(i) + list.get(j);
	            if (tempNum < limit) {
	                sumList.add(tempNum);
	            }
	        }
	    }

	    for (int i=1; i<limit; i++) {

	        if (sumList.contains(i) == false) {

	            sum += i;
	        }
	    }
	    System.out.println(sum);
	}

	public static boolean isAbundant(int n) {

	    int sum=0;
	    for (int i=1; i<n; i++) {

	        if (n%i==0) {

	            sum += i;
	        }
	    }
	    if (sum>n) { return true; }
	    else { return false; }
	}
}
