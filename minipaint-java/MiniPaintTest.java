import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MiniPaintTest {

    protected MiniPaint solution;

    @Before
    public void setUp() {
        solution = new MiniPaint();
    }

    @Test//(timeout = 2000)
    public void testCase0() {
        String[] picture = new String[]{"BBBBBBBBBBBBBBB", "WWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWW", "WWWWWBBBBBWWWWW"};
        int maxStrokes = 6;

        int expected = 0;
        int actual = solution.leastBad(picture, maxStrokes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] picture = new String[]{"BBBBBBBBBBBBBBB", "WWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWW", "WWWWWBBBBBWWWWW"};
        int maxStrokes = 4;

        int expected = 5;
        int actual = solution.leastBad(picture, maxStrokes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] picture = new String[]{"BBBBBBBBBBBBBBB", "WWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWW", "WWWWWBBBBBWWWWW"};
        int maxStrokes = 0;

        int expected = 60;
        int actual = solution.leastBad(picture, maxStrokes);

        Assert.assertEquals(expected, actual);
    }

    @Test//(timeout = 2000)
    public void testCase3() {
        String[] picture = new String[]{"BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW"};
        int maxStrokes = 100;

        int expected = 40;
        int actual = solution.leastBad(picture, maxStrokes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] picture = new String[]{"B"};
        int maxStrokes = 1;

        int expected = 0;
        int actual = solution.leastBad(picture, maxStrokes);

        Assert.assertEquals(expected, actual);
    }

}
