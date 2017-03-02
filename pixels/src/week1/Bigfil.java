package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Bigfil {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:/Users/MAGNETTO/java/pixels/src/tasks/prash.txt"));

		// StringBuffer stringBuffer = new StringBuffer();
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {

			char[] x = line.toCharArray();
			String l = new StringBuffer(line).reverse().toString();
			char[] p = l.toCharArray();
			if (Arrays.equals(x, p)) {
				System.out.println("palindrome \t" + line);
			}

		}
		bufferedReader.close();
	}
}