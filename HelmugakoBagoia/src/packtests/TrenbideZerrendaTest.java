package packtests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.TrenbideZerrenda;

class TrenbideZerrendaTest {
	
	private TrenbideZerrenda tz;
	
	@BeforeEach
	void setUp() throws Exception{
		tz=TrenbideZerrenda.getTrenbideZerrenda(3, 2);
	}
	
	@AfterEach
	void tearDown() throws Exception{
		tz=null;
	}

	@Test
	void testGetTrenbideZerrenda() {
		assertNotNull(tz);
		TrenbideZerrenda tz2=TrenbideZerrenda.getTrenbideZerrenda(3,2);
		assertEquals(tz,tz2);
	}

	@Test
	void testZatiaLortu() {
		assertNull(tz.zatiaLortu(0));
		TrenbideZerrenda tz3=TrenbideZerrenda.getTrenbideZerrenda(3, 2);
		assertNotNull(tz3.zatiaLortu(1));
	}

}
