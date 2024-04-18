package packproiektua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenbideBatTest {
	
	TrenbideBat t1;
	
	@BeforeEach
	void setUp() throws Exception {
		t1=new TrenbideBat();
	}
	

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	public void testInprimatuZatia() {
		System.out.println("........      |-|      .......");
		t1.inprimatuZatia();
		
	}

}
