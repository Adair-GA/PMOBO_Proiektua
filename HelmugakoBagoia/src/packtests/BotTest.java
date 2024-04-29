package packtests;
import packproiektua.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packproiektua.Bot;

class BotTest {

	@Test
	void testAukeratuBidea() {
		Bot bt = new Bot();
		int bideMax = 3;
		int i = 0;
		while (i < 10)
		{
			int aukera = bt.aukeratuBidea(bideMax);
			System.out.println("Botak hurrengo bidea aukeratu du eta bideMaximoa 3 da: " +aukera);
			assertTrue(aukera >= 1 && aukera <= bideMax);
			i ++;
		}
	}

	@Test
	void testBot() {
		int i = 0;
		while(i<10)
		{
			Bot bt = new Bot();
			System.out.println(bt.getIzena());
			i++;
		}
	}

}
