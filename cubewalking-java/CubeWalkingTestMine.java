import static org.junit.Assert.*;

import org.junit.Test;

public class CubeWalkingTestMine {

	@Test
	public void test() {
		CubeWalking cw = new CubeWalking();
		assertEquals(3, cw.changeDir(0, 'L'));
		assertEquals(1, cw.changeDir(0, 'R'));
		assertEquals(3, cw.changeDir(2, 'R'));

	}

}
