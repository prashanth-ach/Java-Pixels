//grep command implementation using java to count the occurances
//of a particular word in a directory of java codes
//................................................................
//The below program i have used to count occurances of keyword "pubilc"
package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LinuxSearch {
	public int cnt = 0;

	public void plugin_execute() throws IOException {
		// check if dirctory exist and create a list of files into an array
		File dir = new File("E:/workspace/Java-Pixels/src/week4");
		String[] children = dir.list();
		if (children == null) {
			System.out.println("does not exist is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				// providing input to "teststring" method to check word count of
				// "public" in each file
				if (filename != null) {
					teststring("E:/workspace/Java-Pixels/src/week4/" + filename, "public", filename);
				}

			}
			System.out.println("......................................................");
			System.out.println("Total count:" + cnt);
		}
	}

	// Actual logic to check the word count of "public" keyword in individual
	// file and in whole directory
	public boolean teststring(String filePath, String str, String name) throws IOException {

		BufferedReader br = null;
		File file = new File(filePath);
		boolean result = false;
		if (!file.exists())
			return false;
		else
			br = new BufferedReader(new FileReader(filePath));
		String sCurrentLine = "";
		int count = 0;
		while ((sCurrentLine = br.readLine()) != null) {
			if (sCurrentLine.contains(str)) {
				result = true;
				count++;
				cnt++;
			}
		}
		System.out.println(name + ":" + count);
		br.close();
		return result;
	}

	public static void main(String[] args) throws IOException {
		LinuxSearch l = new LinuxSearch();
		l.plugin_execute();
	}
}