import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlphabetCountTest {

	protected AlphabetCount solution;

	@Before
	public void setUp() {
		solution = new AlphabetCount();
	}

	@Test
	// (timeout = 2000)
	public void testCase0() {
		String[] grid = new String[] { "ABC", "CBZ", "CZC", "BZZ", "ZAA" };
		int length = 3;

		int expected = 7;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] grid = new String[] { "AAAA", "AAAA", "AAAA" };
		int length = 1;

		int expected = 12;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] grid = new String[] { "ABAB", "BABA", "ABAB", "BABA" };
		int length = 2;

		int expected = 24;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] grid = new String[] { "HIJKLMNOPQZZZONMLKHIDZYQR",
				"GYXWVUTSRASTZZPSTUJGECPXS", "FZABCDEFARQPUQRAAAVWFBOWT",
				"EONMJIHGAJMNOVAAAAAYXANUV", "DCBLKDEFIEKLEDWAAAZFGHMLK",
				"UVAZYBCGHFDFCAYXNPQZEDIJA", "TSWXAKLZGCZBGZIJOMZRUTCBZ",
				"RQPONMJIHBAZZHZZKLZZSVWXY" };
		int length = 26;

		int expected = 7;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] grid = new String[] { "CZC", "ZBZ", "AZA" };
		int length = 3;

		int expected = 4;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test//(timeout = 2000)
	public void testCase5() {
		String[] grid = new String[] { "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ" };
		int length = 26;

		int expected = 1000000000;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String[] grid = new String[] {
				"BDBCBACABDDCCADCBDDCBDDDBCCCCABACADDDCCCBADDDBADCA",
				"DCBBBACBDBACCADABCCAABACDBADBCBBABACBCADADCBDABBBD" };
		int length = 4;

		int expected = 20;
		int actual = solution.count(grid, length);

		Assert.assertEquals(expected, actual);
	}

}
