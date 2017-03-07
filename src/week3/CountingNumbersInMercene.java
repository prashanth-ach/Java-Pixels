package week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingNumbersInMercene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[10];
		char q;
		int l = 0, m = 0;
		File file = new File("E:/workspace/java/pixels/src/mypackage/chandra");
		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int i = 0; i < line.length(); i++) {

					q = line.charAt(i);
					l = Character.getNumericValue(q);
					p[l] = p[l] + 1;

				}
			}
			for (int i = 0; i <= 9; i++) {
				System.out.println("No of " + m + ":" + p[i]);
				m++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}

}
