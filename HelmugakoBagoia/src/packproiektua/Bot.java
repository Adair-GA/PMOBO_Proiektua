package packproiektua;

import java.util.Random;

public class Bot extends Jokalaria {
	
	private static final String[] izenak = { "Apollo", "DuoLingo", "Hammer", "Golem", "Botfather", "Cosmic", "Silver"};
	public Bot()
	{
		super();
		izenaEsleitu();
	}
	
	private void izenaEsleitu()
	{
		Random r = new Random();
		int randomIndex = r.nextInt(izenak.length);
		this.izena = izenak[randomIndex];
	}
	
	@Override
	public void aukeratuBidea(int pBideMax)
	{
		Random r = new Random();
		this.pos = 1 + r.nextInt(pBideMax);
	}
}
