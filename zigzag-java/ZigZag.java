public class ZigZag {

	public int longestZigZag(int[] sequence) {
		if (sequence.length == 1)
			return 1;
		
		int[] diff_sequence = new int[sequence.length - 1];
		for (int i = 1; i < sequence.length; i++)
			diff_sequence[i - 1] = sequence[i] - sequence[i - 1];

		int[] T = new int[diff_sequence.length];
		int max = Integer.MIN_VALUE;
		T[0] = 1;
		for (int i = 1; i < T.length; i++) {
			if (diff_sequence[i] < 0) {
				for (int j = 0; j < i; j++)
					if (diff_sequence[j] > 0)
						max = Math.max(max, T[j]);
			} else if (diff_sequence[i] > 0) {
				for (int j = 0; j < i; j++)
					if (diff_sequence[j] < 0)
						max = Math.max(max, T[j]);
			} else
				max = 0;
			T[i] = max + 1;
		}
		max = Integer.MIN_VALUE;
		for (int i = 0; i < T.length; i++)
			max = Math.max(T[i], max);
		return max + 1;
	}
}
