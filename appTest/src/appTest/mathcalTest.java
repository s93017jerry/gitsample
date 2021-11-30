package appTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathcalTest {

	@Test
	void test() {
		assertEquals(8,new mathcal().add(3, 5));
	}
	@Test
	void test1() {
		assertEquals(5,new mathcal().sub(6, 3));
	}
}
