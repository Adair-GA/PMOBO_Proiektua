package packproiektua;

import java.util.Random;

public class Lapurra extends Oztopoa
{
	private final Random r = new Random();
	
	private int DiruaBalioa = 0;
	
	public Lapurra()
	{
		this.DiruaBalioa = 1 + r.nextInt(5);
	}
	
	public int getDiruaBalioa()
	{
		return this.DiruaBalioa;
	}
}
