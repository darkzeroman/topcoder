public class CubeWalking {

	public String finalPosition(String movement) {
		int d = 0;
		int[] location = new int[] { 1, 1 };
		char[] arr = movement.toCharArray();
		for (char ch : arr) {
			if (ch == 'L')
				d = changeDir(d, ch);
			else if (ch == 'R')
				d = changeDir(d, ch);
			else
				locationUpdate(location, d);
		}

		location = new int[] { location[0] % 3, location[1] % 3 };
		String[][] map = new String[][] { { "RED", "BLUE", "RED" },
				{ "BLUE", "GREEN", "BLUE" }, { "RED", "BLUE", "RED" } };
		return map[location[0]][location[1]];

	}

	void locationUpdate(int[] location, int dir) {
		switch (dir) {
		case 0:
			location[1]++;
			break;
		case 1:
			location[0]++;
			break;
		case 2:
			location[1]--;
			break;
		case 3:
			location[0]--;
			break;
		default:
			break;
		}

	}

	int changeDir(int currDir, char dir) {
		if (dir == 'L')
			currDir--;
		else
			currDir++;
		if (currDir < 0)
			currDir = currDir + 4;
		currDir = currDir % 4;
		return currDir;
	}
}
