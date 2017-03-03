package week2;

import java.util.ArrayList;
import java.util.List;

public class Multiplestth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < 1000; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				l.add(i);
			}
		}
		for (int j = 0; j < l.size(); j++) {
			sum = sum + l.get(j);
		}
		System.out.println(sum);
	}

}
