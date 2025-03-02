package packtests;
import packproiektua.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packproiektua.Jokalaria;

class JokalariaTest {
	
	private Jokalaria j1, j2, j3, j4;

	@BeforeEach
	void setUp() throws Exception 
	{
		j1=new Jokalaria();
		j2= new Jokalaria();
		j3=new Jokalaria();
		j4=new Jokalaria();
	}

	@AfterEach
	void tearDown() throws Exception {
		j1=null;
		j2=null;
		j3=null;
		j4=null;
	}

	

	@Test
	void testAukeratuBidea() {
		int biaMax = 4;
		
		System.out.print("sartu 1 zenbakia: ");
		assertEquals(1,j1.aukeratuBidea(biaMax));
		
		System.out.print("sartu 2 zenbakia: ");
		assertEquals(2,j1.aukeratuBidea(biaMax));
		
		System.out.print("sartu 3 zenbakia: ");
		assertEquals(3,j1.aukeratuBidea(biaMax));
		
		System.out.print("sartu 4 zenbakia: ");
		assertEquals(4,j1.aukeratuBidea(biaMax));
		
		System.out.println("Hurrengo froga hau itzuli beharko luke: --Ez da existitzen aukeratu duzun bidea, mesedez beste zenbaki bat sartu:--");
		System.out.print("sartu 5 zenbakia: ");
		j1.aukeratuBidea(biaMax);
		
		System.out.print("sartu e letra: ");
		System.out.println("Hurrengo froga hau itzuli beharko luke: --Sartu zenbaki bat mesedez: --");
		j1.aukeratuBidea(biaMax);
		
	}

	@Test
	void testGetPosizioa() {
		assertEquals(1,j1.getPosizioa());
		
		assertEquals(1,j2.getPosizioa());
		
		assertEquals(1,j3.getPosizioa());
		
		assertEquals(1,j4.getPosizioa());
		
		assertNotEquals(2,j1.getPosizioa());
		
		assertNotEquals(2,j2.getPosizioa());
		
		assertNotEquals(2,j3.getPosizioa());
		
		assertNotEquals(2,j4.getPosizioa());
		
		assertNotEquals(3,j1.getPosizioa());
		
		assertNotEquals(3, j2.getPosizioa());
		
		assertNotEquals(3,j3.getPosizioa());
		
		assertNotEquals(3,j4.getPosizioa());
		
		assertNotEquals(4,j1.getPosizioa());
		
		assertNotEquals(4,j2.getPosizioa());
		
		assertNotEquals(4,j3.getPosizioa());
		
		assertNotEquals(4,j3.getPosizioa());
		


		
		
	}

	@Test
	void testGehituTxanponak() {
		int txanponak=10;
		
		j1.gehituTxanponak(txanponak);
		assertEquals(10, j1.getTxanponak());
		
		j2.gehituTxanponak(txanponak);
		assertEquals(10,j2.getTxanponak());
		
		j3.gehituTxanponak(txanponak);
		assertEquals(10,j3.getTxanponak());
		
		j4.gehituTxanponak(txanponak);
		assertEquals(10,j4.getTxanponak());
		
		j1.gehituTxanponak(txanponak);
		assertNotEquals(15,j1.getTxanponak());
		
		j2.gehituTxanponak(txanponak);
		assertNotEquals(18,j2.getTxanponak());
		
		j3.gehituTxanponak(txanponak);
		assertNotEquals(18,j3.getTxanponak());
		
		j4.gehituTxanponak(txanponak);
		assertNotEquals(18,j4.getTxanponak());
	}

}
