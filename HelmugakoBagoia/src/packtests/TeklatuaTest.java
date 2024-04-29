package packtests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Teklatua;

class TeklatuaTest {
	private Teklatua tkl1, tkl2, tkl3, tkl4;
	
	@BeforeEach
	void setUp() throws Exception {
		tkl1= Teklatua.getTeklatua();
		tkl2=Teklatua.getTeklatua();
		tkl3=Teklatua.getTeklatua();
		tkl4=Teklatua.getTeklatua();
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		tkl1=null;
		tkl2=null;
		tkl3=null;
		tkl4=null;
	}

	@Test
	void testGetTeklatua() {
		
	}

	@Test
	void testGetReturn() {
		tkl1.getReturn();
	}

	@Test
	void testGetIzena() {
		System.out.println("Sartu Erlantz: ");
		assertEquals("Erlantz", tkl1.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertEquals("Erlantz", tkl2.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertEquals("Erlantz", tkl3.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertEquals("Erlantz", tkl4.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertNotEquals("Jon", tkl1.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertNotEquals("Mikel", tkl2.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertNotEquals("Iker", tkl3.getString("Idatzi zure izena: "));
		
		System.out.println("Sartu Erlantz: ");
		assertNotEquals("Ane", tkl4.getString("Idatzi zure izena: "));
	}

	@Test
	void testAukeratuBidea() {
	int bideMax=4;
		
		System.out.println("Sartu bide kopuru bat: ");
		assertEquals(4,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertEquals(4,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertEquals(4,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertEquals(4, tkl4.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(3,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(7,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(10,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(5,tkl4.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(20,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(21,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(2100,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(3500,tkl4.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(1,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(1,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(1,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(1,tkl4.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(0,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(0,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(0,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(0,tkl4.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(-1,tkl1.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(-1,tkl2.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(-1,tkl3.aukeratuBidea(bideMax));
		
		System.out.println("Sartu bide kopuru bat: ");
		assertNotEquals(-1,tkl4.aukeratuBidea(bideMax));
	}

	@Test
	void testAukeratuInt() {
		System.out.println("Sartu 4 zenbakia: ");
		assertEquals(4,tkl1.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertEquals(4, tkl2.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertEquals(4,tkl3.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertEquals(4,tkl4.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(3,tkl1.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(3,tkl2.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(3,tkl3.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(3,tkl4.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(10,tkl1.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(20,tkl2.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(21,tkl3.aukeratuInt());
		
		System.out.println("Sartu 4 zenbakia: ");
		assertNotEquals(24,tkl4.aukeratuInt());
		
	}

}
