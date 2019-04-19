import java.util.Scanner; //import the Scanner object

public class euc {
	public int gcd(int m, int n) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		
		int r = -1;
		int returnVal = -1;
		do {
			// E1 [Find remainder.] Divide m by n and let r be the remainder. 
			// (We will have 0 <= r < n.)
			r = m % n;
			String output = String.format("m: %2d, n: %2d, r: %2d", m, n, r);
			System.out.println(output);
			// E2 [Is it zero?] If r = 0, the algorithm terminates; n is the answer
			if (r == 0) {
				returnVal = n;
			}
			// E3 [Reduce.] Set m <- n, n <- r, and go back to step E1
			else {
				m = n;
				n = r;
			}
		} while (r != 0);

		return returnVal;
	}
}
