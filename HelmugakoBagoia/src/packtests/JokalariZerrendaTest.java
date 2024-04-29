package packtests;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.JokalariZerrenda;
import packproiektua.Jokalaria;

class JokalariZerrendaTest {
	
	private JokalariZerrenda jz1;
	
	@BeforeEach
	void setUp() throws Exception{
		jz1=JokalariZerrenda.getJokalariZerrenda();
		
	}
	
	@AfterEach
	void tearDown() throws Exception{
		jz1=null;
		
	}

	@Test
	void testGetJokalariZerrenda() {
		
		
	}

	@Test
	void testJokalariaSortu() {
		jz1.jokalariaSortu();
		assertEquals(1,jz1.getZerrendaLuzera());
		
		
	}

	@Test
	void testBotaSortu() {
		
		jz1.jokalariaSortu();
		
		assertEquals(1,jz1.getZerrendaLuzera());
		assertNotEquals(5,jz1.getZerrendaLuzera());
	}

	@Test
	void testGetZerrendaLuzera() {
		jz1.jokalariaSortu();
		
		assertEquals(1,jz1.getZerrendaLuzera());
		assertNotEquals(10,jz1.getZerrendaLuzera());
	}

	@Test
	void testJokalariaBueltatu() {
		
		Jokalaria jok=new Jokalaria();
		jz1.jokalariaSortu();
		assertEquals(jok,jz1.getZerrendaLuzera());
		
		
		
		
	}

	@Test
	void testEzabatuJokalariak() {
		jz1.jokalariaSortu();
		jz1.botaSortu();
		jz1.ezabatuJokalariak();
		assertEquals(0,jz1.getZerrendaLuzera());
		jz1.jokalariaSortu();
		assertEquals(1,jz1.getZerrendaLuzera());
		jz1.ezabatuJokalariak();
		assertEquals(0,jz1.getZerrendaLuzera());
		
	}

	@Test
	void testInprimatuTxanponak() {
		jz1.jokalariaSortu();
		jz1.inprimatuTxanponak();
	}

	@Test
	void testNorDaDirudunena() {
		jz1.jokalariaSortu();
		jz1.botaSortu();
		jz1.norDaDirudunena();
	}

	@Test
	void testJokalariakJokatu() {
		
	}

}
