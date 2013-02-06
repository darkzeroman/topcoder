import java.math.*;

public class FairTournament {

	boolean[][] done = new boolean[101][1 << 13];
	BigInteger[][] res = new BigInteger[101][1 << 13];

	public BigInteger poisk(int m, int X, int k, int end) {
		// System.out.println
		if (m == end)
			return BigInteger.ONE;
		if (done[m][X])
			return res[m][X];
		BigInteger r = BigInteger.ZERO;
		int w = X;
		if ((X & 1) == 0 && m >= k) {
			r = poisk(m + 1, X >> 1, k, end);
		} else {
			X = X >> 1;
			for (int i = 0; i < 2 * k; i++) {
				if (1 + m + i - k >= 0 && 1 + m + i - k < end
						&& ((X & (1 << i)) == 0)) {
					r = r.add(poisk(m + 1, X + (1 << i), k, end));
				}
			}
		}
		res[m][w] = r;
		done[m][w] = true;
		return r;
	}

	public String countPermutations(int n, int k) {
		return "" + poisk(0, 0, k, n);
	}
}