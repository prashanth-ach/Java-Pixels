package week1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Readfil {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:/Users/MAGNETTO/java/pixels/src/tasks/rockyou.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append(" ");
			line = buf.readLine();
		}
		String fileAsString = sb.toString();
		System.out.println("Contents : " + fileAsString);

		buf.close();
	}

}