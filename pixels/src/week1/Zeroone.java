package week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zeroone {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("E:/workspace/java/pixels/src/tasks/zero.txt"));

		// StringBuffer stringBuffer = new StringBuffer();
		String line = null;
		int count = 0;

		while ((line = bufferedReader.readLine()) != null) {

			char[] x = line.toCharArray();

			for (int i = 0; i < x.length; i++) {
				if (x[i] == '1') {

					count++;
				}
			}
			// String l = new StringBuffer(line).reverse().toString();
			// char[] p = l.toCharArray();
			// if (Arrays.equals(x, p))
			// {
			// System.out.println("palindrome \t"+line);
			// }

		}
		System.out.println(count);
		bufferedReader.close();
	}
}
