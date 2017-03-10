package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("D:\\testout.txt");
		fw.write("Welcome to javaTpoint.");
		fw.close();

		System.out.println("Success...");
		  FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
	}

}
