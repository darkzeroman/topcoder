public class AlphabetCount {

	public int count(String[] grid, int length) {

		long[][] T = new long[grid.length][grid[0].length()];
		char[][] char_grid = new char[grid.length][grid[0].length()];

		for (int y = 0; y < grid.length; y++) {
			char_grid[y] = grid[y].toCharArray();
			for (int x = 0; x < char_grid[y].length; x++)
				if (char_grid[y][x] == 'A')
					T[y][x] = 1;
		}

		char curr_char = 'B';
		length--;

		while (length != 0) {
			for (int y = 0; y < grid.length; y++)
				for (int x = 0; x < grid[y].length(); x++) {
					if (curr_char == char_grid[y][x])
						T[y][x] += findNumAround(char_grid, T, y, x);
				}
			curr_char++;
			length--;
		}

		curr_char--;
		long total_sum = 0;
		for (int y = 0; y < grid.length; y++)
			for (int x = 0; x < grid[y].length(); x++) {
				if (char_grid[y][x] == curr_char)
					total_sum += T[y][x];
			}

		if (total_sum > 1000000000)
			return 1000000000;
		return (int) total_sum;

	}

	public long findNumAround(char[][] char_grid, long[][] T, int y, int x) {
		char char_to_find = char_grid[y][x];
		char_to_find--;

		long sum = 0;
		int[][] offsets = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 },
				{ -1, 0 }, { -1, -1 }, { 1, -1 }, { 1, 1 }, { -1, 1 } };

		for (int[] offset : offsets)
			if (x + offset[0] >= 0 && x + offset[0] < char_grid[y].length
					&& y + offset[1] >= 0 && y + offset[1] < char_grid.length)
				if (char_grid[y + offset[1]][x + offset[0]] == char_to_find)
					sum += T[y + offset[1]][x + offset[0]];

		return sum;
	}

}
