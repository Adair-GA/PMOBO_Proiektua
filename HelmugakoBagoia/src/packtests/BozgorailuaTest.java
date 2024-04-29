package packtests;

import packproiektua.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Bozgorailua;

class BozgorailuaTest {
	private Bozgorailua b;
	
	@BeforeEach
	void setUp() throws Exception{
		b = Bozgorailua.getBozgorailua();
	}

	@Test
	void testGetBozgorailua() {
		
	}

	@Test
	void testBackMusicHasi() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		bz.backMusicHasi();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testBackMusicPausatu() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		bz.backMusicPausatu();
	}

	@Test
	void testBackMusicItzali() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		bz.backMusicItzali();
	}

}
