package week4;

public class TriPentaHexa {
	public TriPentaHexa() {
		next();
	}

	public void next() {


		int n = 144;
		int i = 165;
		int p = i * (3 * i - 1) / 2;
		int h = n * (2 * n - 1);
		while (p != h) {
		    n++;
		    h = n * (2 * n - 1);
		    while (h > p) {
		        i++;
		        p = i * ((3 * i - 1) / 2);
		    }
		}
	
		System.out.println("the next triangular number is:\t" + h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TriPentaHexa();

	}

}
