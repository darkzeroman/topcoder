import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CubeWalkingTest {

    protected CubeWalking solution;

    @Before
    public void setUp() {
        solution = new CubeWalking();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String movement = "LLRR";

        String expected = "GREEN";
        String actual = solution.finalPosition(movement);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String movement = "WWWWWWWWWWWW";

        String expected = "GREEN";
        String actual = solution.finalPosition(movement);

        Assert.assertEquals(expected, actual);
    }

    @Test//(timeout = 2000)
    public void testCase2() {
        String movement = "WLWRW";

        String expected = "RED";
        String actual = solution.finalPosition(movement);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String movement = "WWLLWRWLWLLRWW";

        String expected = "BLUE";
        String actual = solution.finalPosition(movement);

        Assert.assertEquals(expected, actual);
    }

}
