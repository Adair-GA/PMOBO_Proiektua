package packproiektua;

import java.util.Random;

public class Bot extends Jokalaria {
	
	private static final String[] izenak = { "Apollo", "DuoLingo", "Hammer", "Golem", "Botfather", "Cosmic", "Silver"};
	private final Random r = new Random();
	
	public Bot()
	{
		this.pos = 1;
		izenaEsleitu();
	}
	
	private void izenaEsleitu()
	{
		int randomIndex = r.nextInt(izenak.length);
		this.izena = izenak[randomIndex];
	}
	
	@Override
	public void aukeratuBidea(int pBideMax)
	{
		this.pos = 1 + r.nextInt(pBideMax);
	}
}
