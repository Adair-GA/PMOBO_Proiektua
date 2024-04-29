package packtests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Inprimatzailea;

class InprimatzaileaTest {
	
	private Inprimatzailea  i1;
	
	@BeforeEach
	void setUp() throws Exception{
		i1=Inprimatzailea.getInprimatzailea();
	}
	@AfterEach
	void tearDown() throws Exception{
		i1=null;
	}
	

	@Test
	void testGetInprimatzailea() {
		
	}

	@Test
	void testInprimatuBat() {
		int i=0;
		
		
	}

	@Test
	void testInprimatuAsko() {
		fail("Not yet implemented");
	}

	@Test
	void testIdazketaAnimazioa() {
		fail("Not yet implemented");
	}

	@Test
	void testZorionakIdatzi() {
		fail("Not yet implemented");
	}

}
