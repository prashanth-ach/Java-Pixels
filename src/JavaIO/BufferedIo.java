package JavaIO;

import java.io.*;

public class BufferedIo {
	public static void main(String args[]) throws Exception {

		FileInputStream fin = new FileInputStream("D:\\testout.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);

			bin.close();
			fin.close();
		}
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javaTpoint.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}
}