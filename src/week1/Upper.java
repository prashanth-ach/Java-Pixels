package week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Upper {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:/Users/MAGNETTO/java/tasks/src/tasks/prash.txt"));

		// StringBuffer stringBuffer = new StringBuffer();
		String line = null;
		System.out.println("To upper case");
		System.out.println(".............");
		while ((line = bufferedReader.readLine()) != null) {

			System.out.println("\n" + line.toUpperCase());

		}
		bufferedReader.close();
	}
}