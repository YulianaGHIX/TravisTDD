package travismaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TravisTest {
	@Test
	public void testAdd() {
		Travis calc = new Travis();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		Travis calc = new Travis();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		Travis calc = new Travis();
		assertEquals(calc.mul(3, 5), 16);
	}
	@Test
	public void testDiv() {
		Travis calc = new Travis();
		assertEquals(calc.div(8, 2), 4);
	}
}
