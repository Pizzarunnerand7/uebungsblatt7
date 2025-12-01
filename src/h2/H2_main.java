package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {

	}
	public static int[] change(int[]a, int[]b, int start, int end) {
		if(end>start) {
			if(Arrays.compare(a,b)!= 0) {
				int[] c = a;
				return c;
				
			}
			else {
				Arrays.sort(a);
				int[]c=Arrays.copyOfRange(a, start, end);
				return c;
			}
		}
		else {
			int[] c = new int[0];
			return c;
		}
	}

}
