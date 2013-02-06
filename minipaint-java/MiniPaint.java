public class MiniPaint {
	boolean ddd = false;

	int[] dostr(String s) {
		char[] ss = s.toCharArray();
		int n = s.length() + 1;
		int[][] w = new int[n][n];
		for (int i = 0; i < n; i++) {
			w[i][0] = i;
		}
		for (int at = 1; at <= s.length(); at++) {
			for (int j = 0; j < n; j++) {
				w[at][j] = w[at - 1][j] + 1;
			}
			int countB = 0;
			int countW = 0;
			for (int bef = at - 1; bef >= 0; bef--) {
				if (ss[bef] == 'B')
					countB++;
				else
					countW++;
				int m = Math.min(countB, countW);
				for (int k = 1; k < n; k++) {
					w[at][k] = Math.min(w[at][k], w[bef][k - 1] + m);
				}
			}
		}
		System.out.print("For " + s + " we got ");
		for (int i = 0; w[s.length()][i] > 0; i++) {
			System.out.print(" " + w[s.length()][i]);
		}
		System.out.println();
		return w[s.length()];
	}

	public int leastBad(String[] picture, int maxStrokes) {
		int i, j, k;
		int[] best = new int[3010];
		for (i = 0; i < picture.length; i++) {
			int nn = picture[i].length();
			int[] a = dostr(picture[i]);
			int newbest[] = new int[3010];
			for (j = 0; j < 3010; j++) {
				newbest[j] = best[j] + nn;
			}
			for (j = 0; j < a.length; j++) { // how many to give to this pic
				for (k = j; k < 3010; k++) {
					newbest[k] = Math.min(newbest[k], best[k - j] + a[j]);
				}
			}
			best = newbest;
		}
		return best[maxStrokes];
	}

	static void pp(Object o) {
		System.out.println(o);
	}
}