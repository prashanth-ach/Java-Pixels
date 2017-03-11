package week4;

import java.util.Arrays;

public class PermutedMultiples {
	
	public void Permute() {
		
		loop:for (int i = 1; ; i++) {
			for (int j = 2; j < 6; j++) {
				if (!Check(i * j, i * (j + 1)))
					continue loop;
			}
			System.out.println(Integer.toString(i));
			break;
		}
	}
	
	
	public boolean Check(int a, int b) {
		char[] arr1 = Integer.toString(a).toCharArray();
		char[] arr2 = Integer.toString(b).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutedMultiples p=new PermutedMultiples();
		p.Permute();
		
	}

}
