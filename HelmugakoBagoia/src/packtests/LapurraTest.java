package packtests;
import packproiektua.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packproiektua.Lapurra;

class LapurraTest {

	@Test
	void testLapurra() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDiruaBalioa() {
		Lapurra lapurra = new Lapurra();
		int diruBalioa = lapurra.getDiruaBalioa();
		assertTrue(diruBalioa >= 1 && diruBalioa <= 5);
	}

}
