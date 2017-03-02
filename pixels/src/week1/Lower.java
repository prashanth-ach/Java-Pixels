package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lower {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:/Users/MAGNETTO/java/tasks/src/tasks/prash.txt"));

		// StringBuffer stringBuffer = new StringBuffer();
		String line = null;

		System.out.println("To lower case");
		System.out.println(".............");

		while ((line = bufferedReader.readLine()) != null) {

			System.out.println("\n" + line.toLowerCase());

		}
		bufferedReader.close();
	}
}