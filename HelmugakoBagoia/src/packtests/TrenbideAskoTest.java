package packtests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packproiektua.TrenbideAsko;

class TrenbideAskoTest {

	TrenbideAsko ta;


	@Test
	void testOztopoaDago() {
		TrenbideAsko trenbide = new TrenbideAsko(5);
		int oztopoaPos = trenbide.oztopoaDago();
		assertTrue(oztopoaPos >= 0 && oztopoaPos < 5);
	}

	@Test
	void testInprimatuZatiaIntIntIntBoolean() {
		ta = new TrenbideAsko(4);
		ta.inprimatuZatia(4, 2, 3, false);
	}

	@Test
	void testTxanponaDago() {
		TrenbideAsko trenbide = new TrenbideAsko(5);
		int txanponaPos = trenbide.txanponaDago();
		assertTrue(txanponaPos >= 0 && txanponaPos < 5);
	}

	@Test
	void testGetTxanpona() {
		TrenbideAsko trenbide = new TrenbideAsko(5);
		int txanponBalioa = trenbide.getTxanpona();
		assertTrue(txanponBalioa >= 1 && txanponBalioa <= 10);
	}

}
