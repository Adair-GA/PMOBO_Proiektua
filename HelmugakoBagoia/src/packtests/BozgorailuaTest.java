package packtests;

import packproiektua.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packproiektua.Bozgorailua;

class BozgorailuaTest {

	@Test
	void testGetBozgorailua() {
		fail("Not yet implemented");
	}

	@Test
	void testBackMusicHasi() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		bz.backMusicHasi();
	}

	@Test
	void testBackMusicPausatu() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		//bz.backMusicPausatu();
	}

	@Test
	void testBackMusicItzali() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		//bz.backMusicItzali();
	}

}
