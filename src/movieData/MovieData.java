package movieData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MovieData {
	public void uniqueUser() throws IOException {

		Set<Integer> hs = new HashSet<>();

		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");

			hs.add(Integer.parseInt(parts[0]));

		}

		in.close();
		System.out.println("Unique user id:" + hs.size());
	}

	public void uniqueMovie() throws IOException {

		Set<Integer> hs = new HashSet<>();

		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");

			hs.add(Integer.parseInt(parts[1]));

		}

		in.close();
		System.out.println("Unique Movie:" + hs.size());

	}

	public void highRating() throws IOException {
		ArrayList<Double> l = new ArrayList<Double>();
		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");

			if (Double.parseDouble(parts[2]) == 1.00)

			{
				l.add(Double.parseDouble(parts[2]));
			}

		}

		in.close();
		System.out.println("Highest Rating:" + l.size());
	}

	public void lowRating() throws IOException {
		ArrayList<Double> l = new ArrayList<Double>();
		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");

			if (Double.parseDouble(parts[2]) < 0.50)

			{
				l.add(Double.parseDouble(parts[2]));
			}

		}

		in.close();
		System.out.println("Low Rating:" + l.size());
	}

	public void maxTimes() throws IOException {
		ArrayList<Integer> l = new ArrayList<Integer>();
		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");
			l.add(Integer.parseInt(parts[0]));
		}
		int currentMax = 0;
		int maxCount = 0;
		int current = 0;
		int count = 0;
		for (int i = 0; i < l.size(); i++) {
			int item = l.get(i);
			if (item == current) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					currentMax = current;
				}
				count = 1;
				current = item;
			}
		}
		in.close();
		System.out.println("user id:" + currentMax + "  Watched maximum times with value:" + maxCount);
	}

	public void minTimes() throws IOException {
		ArrayList<Integer> l = new ArrayList<Integer>();
		BufferedReader in = new BufferedReader(new FileReader("E:/workspace/Java-Pixels/txtdata/chandra.txt"));
		String line = "";
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\t");
			l.add(Integer.parseInt(parts[0]));
		}
		@SuppressWarnings("unused")
		int currentMin = 0;
		int minCount = 0;
		int current = 0;
		int count = 1;
		for (int i = 0; i < l.size(); i++) {
			int item = l.get(i);
			if (item == current) {
				count++;
			} else {
				if (count < minCount) {
					minCount = count;
					currentMin = current;
				}
				count = 1;
				current = item;
			}
		}
		in.close();
		System.out.println("User id:" + current + "  Watched min times with value:" + count);
	}

	public static void main(String[] args) throws Exception {
		MovieData u = new MovieData();
		u.uniqueUser();
		u.uniqueMovie();
		u.highRating();
		u.lowRating();
		u.maxTimes();
		u.minTimes();
	}
}