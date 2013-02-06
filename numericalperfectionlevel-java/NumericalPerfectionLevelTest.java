import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumericalPerfectionLevelTest {

    protected NumericalPerfectionLevel solution;

    @Before
    public void setUp() {
        solution = new NumericalPerfectionLevel();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long N = 4L;

        int expected = 0;
        int actual = solution.getLevel(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long N = 144L;

        int expected = 1;
        int actual = solution.getLevel(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long N = 1152L;

        int expected = 1;
        int actual = solution.getLevel(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long N = 1679616L;

        int expected = 2;
        int actual = solution.getLevel(N);

        Assert.assertEquals(expected, actual);
    }

}
