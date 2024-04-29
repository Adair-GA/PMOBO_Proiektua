package packtests;

import packproiektua.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Bozgorailua;

class BozgorailuaTest {
	private Bozgorailua b1,b2,b3;
	
	@BeforeEach
	void setUp() throws Exception{
		b1=new Bozgorailua().getBozgorailua();
		b2=new Bozgorailua().getBozgorailua();
		b3=new Bozgorailua().getBozgorailua();
	}

	@Test
	void testGetBozgorailua() {
		
	}

	@Test
	void testBackMusicHasi() {
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		bz.backMusicHasi();
	}

	@Test
	void testBackMusicPausatu() {
		fail("Not yet implemented");
	}

	@Test
	void testBackMusicItzali() {
		fail("Not yet implemented");
	}

}
