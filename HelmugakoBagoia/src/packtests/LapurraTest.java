package packtests;
import packproiektua.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Lapurra;

class LapurraTest {
	
	@BeforeEach
	void setUp() throws Exception{
		
	}
	
	@AfterEach
	void tearDown() throws Exception{
		
	}

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
