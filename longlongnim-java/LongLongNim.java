import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class LongLongNim {

	public int numberOfWins(int maxN, int[] moves) {

		Arrays.sort(moves);
		int largestMissingNum = findLargestMissingNumber(moves);
		int largestNum = moves[moves.length - 1];

		int length = largestMissingNum + largestNum + 1;
		BitSet bs = new BitSet();

		for (int i = 0; i <= length; i++) {
			for (int move : moves) {
				if (move <= i && !bs.get(i - move)) {
					bs.set(i);
					break;
				}

			}
		}

		int count = length - bs.cardinality();

		int numRepeats = maxN / length;

		int rem = maxN % length;
		int extra = 0;
		if (rem != 0) {
			extra = bs.get(0, rem).cardinality();
		}
		return count * numRepeats + extra;

	}

	public int findLargestMissingNumber(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int num : arr)
			hs.add(num);

		int maxNumber = arr[arr.length - 1];

		for (int i = maxNumber - 1; i >= 0; i--) {
			if (!hs.contains(i))
				return i;
		}
		return 0;
	}

}
