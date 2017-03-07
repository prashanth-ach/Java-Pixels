package week3;

public class CuriousNumber {
	private int factorial(int x) {
	    if (x == 0) {
	        return 1;
	    }
	    int y = x;
	    for (int i = 1; i < x; i++) {
	        y *= i;
	    }
	    return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuriousNumber c=new CuriousNumber();
		int result = 0;
		for (int i = 10; i < 2540161; i++) {
		    int sumOfFacts = 0;
		    int number = i;
		    while (number > 0) {
		        int d = number % 10;
		        number /= 10;
		        sumOfFacts += c.factorial(d);
		    }
		 
		    if (sumOfFacts == i) {
		        result += i;
		    }
		}
System.out.println(result);
	}

}
