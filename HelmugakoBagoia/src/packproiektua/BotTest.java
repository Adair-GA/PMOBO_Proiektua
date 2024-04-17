package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BotTest {

	@Test
	void testAukeratuBidea() {
		fail("Not yet implemented");
	}

	@Test
	void testBot() {
		Bot bt = new Bot();
		bt.izenaAukeratu();
		System.out.print(bt.izena);
	}

}
