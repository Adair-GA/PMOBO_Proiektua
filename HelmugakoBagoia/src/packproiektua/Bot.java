package packproiektua;

import java.util.Random;

public class Bot extends Jokalaria {
	
	private static final String[] izenak = { "Apollo", "DuoLingo", "Hammer", "Golem", "Botfather", "Cosmic", "Silver"};
	private final Random r = new Random();
	
	public Bot()
	{
		//this.izena = "BOT";
		super();
	}
	
	protected void aukeratuIzena()
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
