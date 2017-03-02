package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Performonlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(new Integer[] { 0, 2, 4, 5, 6, 8 }));

		for (int i = 0; i < a.size(); i++) {
			b += a.get(i);
		}
		System.out.println("sum:" + b);
		System.out.print("Reverse:");
		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.print(a.get(i) + "\t");
		}
		System.out.println("\nhead element:" + a.get(0));
		System.out.println("tail element:" + a.get(a.size() - 1));

		if (a.size() % 2 == 0) {
			System.out.println("middle:" + a.get((a.size() / 2) - 1));
			System.out.print("First half:");
			for (int i = 0; i < a.size() / 2; i++) {
				System.out.print(a.get(i) + "\t");
			}
			System.out.println("\n");
			System.out.print("second half:");
			for (int i = (a.size() / 2); i < a.size(); i++) {
				System.out.print(a.get(i) + "\t");
			}
		}

		else {
			System.out.println("middle:" + a.get(((a.size()) / 2)));
			System.out.print("First half:");
			for (int i = 0; i < ((a.size() + 1) / 2); i++) {
				System.out.print(a.get(i) + "\t");
			}
			System.out.println("\n");
			System.out.print("second half:");
			for (int i = (((a.size() + 1) / 2)); i < a.size(); i++) {
				System.out.print(+a.get(i) + "\t");
			}
		}

	}

}
