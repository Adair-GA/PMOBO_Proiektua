package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JokalariZerrendaTest {

	@Test
	void test() {
		JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
		jz.jokalariaSortu();
		jz.botaSortu();
		jz.jokatu(7);
		
	}

}
