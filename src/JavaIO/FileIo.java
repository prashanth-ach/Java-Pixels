package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {
	public static void main(String args[]) throws IOException {

		FileInputStream fin = new FileInputStream("D:\\testout.txt");
		int i = fin.read();
		System.out.print((char) i);

		fin.close();

		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		fout.write(65);
		fout.close();
		System.out.println("success...");

	}
}