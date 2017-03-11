package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int words = 0;
		int lines = 0;
		int chars = 0;
		File file = new File("E:/workspace/Java-Pixels/txtdata/prash.txt");
         Scanner in = new Scanner(file);

		
		while(in.hasNextLine())  {
		    lines++;
		    String line = in.nextLine();
		   for(int i=0;i<line.length();i++)
		    {
		        if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
		        chars ++;
		    }
		    words += new StringTokenizer(line, " ,").countTokens();
		}

		System.out.println(words+" "+lines+" "+chars);
		in.close();
	}

}
