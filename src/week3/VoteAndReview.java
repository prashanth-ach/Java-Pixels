package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class VoteAndReview {

	public static void main(String[] args) throws NumberFormatException, IOException {

		FileReader inputFile = new FileReader("E:/Java-Pixels/pixels/src/week2/chandra.txt");


		BufferedReader bufferReader = new BufferedReader(inputFile);

		// Variable to hold the one line data
		String line = "";

		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> d = new ArrayList<String>();
		ArrayList<String> e = new ArrayList<String>();
		

		while ((line = bufferReader.readLine()) != null) {

			String temp = "";
			int count = 1;

			StringTokenizer st = new StringTokenizer(line, "\t");
            String[] arr= line.split("\t");
			while (st.hasMoreTokens()) {

				temp = st.nextToken();

				if (count == 1) 
				{
					a.add(temp);
				}
				if (count == 2) {
					b.add(temp);
				}
				if (count == 3) 
				{
					c.add(temp);
				}
				if (count == 4) {
					d.add(temp);
				}
				if (count == 5) {
					d.add(temp);
				}
				if (count < 5)
					count++;
			}

		}
		bufferReader.close();
		System.out.println(a + "  " + b+"  "+c+ "  " + d+" "+e);

	}

}
