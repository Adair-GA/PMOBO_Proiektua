package packproiektua;

import java.util.Random;

public class Bot extends Jokalaria {
	
	private static final String[] izenak = { "Apollo", "DuoLingo", "Hammer", "Golem", "Botfather", "Cosmic", "Silver", "Nexus", "CyberByte", "Quantum", "Blitz", "Techno", "Binary", "Synth", "ByteBot", "Volt", "Spark", "ByteMaster", "Omega", "Neon", "ByteBlade", "CircuitBot", "Paco"};
	private final Random r = new Random();
	
	public Bot()
	{
		super();
		this.izenaAukeratu();
		
	}
	
	protected void izenaAukeratu()
	{
		int randomIndex = r.nextInt(izenak.length);
		this.izena = izenak[randomIndex];
	}
	
	@Override
	public int aukeratuBidea(int pBideMax)
	{
		return this.pos = 1 + r.nextInt(pBideMax);
	}
}
