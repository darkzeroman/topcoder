public class BadNeighbors {

	public int maxDonationsWrapper(int[] donations) {
		int[] T = new int[donations.length];
		int[] P = new int[donations.length];

		T[0] = donations[0];
		P[0] = -1;

		for (int i = 1; i < T.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < i - 1; j++) {
				if (max < T[j] + donations[i]) {
					if (i == T.length - 1) {
						if (checkNotIncludingFirst(P, j)) {
							max = T[j] + donations[i];
							P[i] = j;
						}
					} else {
						max = T[j] + donations[i];
						P[i] = j;
					}
				}

			}
			if (max < donations[i]) {
				max = donations[i];
				P[i] = -1;
			}
			T[i] = max;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < T.length; i++)
			max = Math.max(T[i], max);
		return max;
	}

	public int maxDonations(int[] donations) {

		int max = maxDonationsWrapper(donations);
		int[] newarr = new int[donations.length - 1];
		for (int i = 0; i < donations.length - 1; i++)
			newarr[i] = donations[i + 1];

		return Math.max(max, maxDonationsWrapper(newarr));
	}

	public boolean checkNotIncludingFirst(int[] path, int index) {
		while (path[index] != -1) {
			if (path[index] == 0)
				return false;
			index = path[index];
			if (path[index] == 0)
				return false;
		}
		return true;
	}

}
