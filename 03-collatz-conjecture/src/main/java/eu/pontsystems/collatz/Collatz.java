package eu.pontsystems.collatz;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
	
	
	public static int log2(int n) {
		return ((int)(Math.log(n) / Math.log(2)));
	}
	
	
	public static int computeRec(long number, int steps) throws Exception {
		if(number == 1L) {
			return steps;
		} else {
			return computeRec( (number % 2L == 0) ? number / 2L : number * 3L + 1L, steps+1);
		}
	}

	public static int computeIterative(long number) throws Exception {
		int steps = 0;
		while(number != 1L) {
			number = (number % 2L == 0L) ? number / 2L : number * 3L + 1L;
			steps++;
		}
		return steps;
	}
	

	
}
