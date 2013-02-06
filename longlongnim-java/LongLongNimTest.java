import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongLongNimTest {

    protected LongLongNim solution;

    @Before
    public void setUp() {
        solution = new LongLongNim();
    }

    @Test//(timeout = 2000)
    public void testCase0() {
        int maxN = 20;
        int[] moves = new int[]{1, 2, 3};

        int expected = 5;
        int actual = solution.numberOfWins(maxN, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int maxN = 999;
        int[] moves = new int[]{1};

        int expected = 499;
        int actual = solution.numberOfWins(maxN, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test//(timeout = 2000)
    public void testCase2() {
        int maxN = 1000000000;
        int[] moves = new int[]{1, 2};

        int expected = 333333333;
        int actual = solution.numberOfWins(maxN, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test//(timeout = 2000)
    public void testCase3() {
        int maxN = 6543;
        int[] moves = new int[]{2, 4, 7, 11, 20};

        int expected = 1637;
        int actual = solution.numberOfWins(maxN, moves);

        Assert.assertEquals(expected, actual);
    }

}
