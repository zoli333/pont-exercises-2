package eu.pontsystems.collatz;

public class Main {

	public static void main(String[] args) throws Exception {
		int result;
		result = Collatz.computeIterative(8400511L);
		System.out.println(result);
		result = Collatz.computeRec(8400511L,0);
		System.out.println(result);
		
		
	}

}
