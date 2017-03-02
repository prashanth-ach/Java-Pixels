package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uniint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>(Arrays.asList(new Integer[] { 0, 2, 4, 5, 6, 8, 10 }));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(new Integer[] { 5, 6, 7, 8, 9, 10 }));

		List<Integer> c = new ArrayList<Integer>(a);
		c.addAll(b);
		System.out.println(c);

		List<Integer> d = new ArrayList<Integer>(a);
		d.retainAll(b);
		System.out.println(d);

		List<Integer> e = new ArrayList<Integer>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
