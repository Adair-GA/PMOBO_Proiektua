package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packproiektua.TrenbideAsko;

class TrenbideAskoTest {

	@Test
	void testInprimatuZatia() {
		fail("Not yet implemented");
	}

	@Test
	void testTrenbideAsko() {
		fail("Not yet implemented");
	}

	@Test
	void testGetZatia() {
		fail("Not yet implemented");
	}

	@Test
	void testOztopoaDago() {
		TrenbideAsko trenbide = new TrenbideAsko(5);
		int oztopoaPos = trenbide.oztopoaDago();
		assertTrue(oztopoaPos >= 0 && oztopoaPos < 5);
	}

	@Test
	void testInprimatuZatiaIntIntIntBoolean() {
		fail("Not yet implemented");
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
		int txanponBalioa = trenbide.getTxanpona(trenbide.txanponaDago());
		assertTrue(txanponBalioa >= 1 && txanponBalioa <= 10);
	}

}
