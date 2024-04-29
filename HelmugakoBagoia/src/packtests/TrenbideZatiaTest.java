package packtests;

import packproiektua.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenbideZatiaTest {
	private TrenbideBat tb;
	private TrenbideAsko ta;
	@BeforeEach
	void setUp() throws Exception{
		int i = 3;
		tb = new TrenbideBat();
		ta = new TrenbideAsko(i);
		
	}
	
	@AfterEach
	void tearDown() throws Exception{
		
	}

	@Test
	void testInprimatuZatia() {
		tb.inprimatuZatia();
		ta.inprimatuZatia(3, 2, 1, false);
		ta.inprimatuZatia(3, 1, 2, true);
		ta.inprimatuZatia(10, 5, 3, true);
	}

}
