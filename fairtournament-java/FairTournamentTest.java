import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FairTournamentTest {

    protected FairTournament solution;

    @Before
    public void setUp() {
        solution = new FairTournament();
    }

    @Test//(timeout = 2000)
    public void testCase0() {
        int n = 3;
        int k = 1;

        String expected = "3";
        String actual = solution.countPermutations(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 3;
        int k = 2;

        String expected = "6";
        String actual = solution.countPermutations(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 10;
        int k = 3;

        String expected = "19708";
        String actual = solution.countPermutations(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 100;
        int k = 1;

        String expected = "573147844013817084101";
        String actual = solution.countPermutations(n, k);

        Assert.assertEquals(expected, actual);
    }

}
