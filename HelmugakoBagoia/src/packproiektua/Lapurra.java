package packproiektua;

import java.util.Random;

public class Lapurra extends Oztopoa
{
	private final Random r = new Random();
	
	private int DiruaBalioa = 0;
	
	protected Lapurra()
	{
		this.DiruaBalioa = 1 + r.nextInt(5);
	}
	
	protected int getDiruaBalioa()
	{
		return this.DiruaBalioa;
	}
}
