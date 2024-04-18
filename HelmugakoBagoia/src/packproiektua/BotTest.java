package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BotTest {

	@Test
	void testAukeratuBidea() {
		Bot bt = new Bot();
		int bideMax = 3;
		int aukera = bt.aukeratuBidea(bideMax);
		assertTrue(aukera >= 1 && aukera <= bideMax);
	}

	@Test
	void testBot() {
		Bot bt = new Bot();
		bt.izenaAukeratu();
		System.out.print(bt.izena);
	}
	
	@Test
	void testAukeratuIzena()
	{
		
	}

}
