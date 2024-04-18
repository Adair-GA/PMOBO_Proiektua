package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiruaTest {

	Dirua di1;
	Dirua di2;
		
	@BeforeEach
	void setUp() throws Exception {
		di1=new Dirua(2);
		di2=new Dirua(4);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		di1=null;
		di2=null;
	}

	@Test
	protected void testGetBalioa() {
		assertEquals(2,di1.getBalioa());
		assertEquals(4,di2.getBalioa());
	}

}
