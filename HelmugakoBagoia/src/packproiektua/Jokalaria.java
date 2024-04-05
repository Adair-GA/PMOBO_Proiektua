package packproiektua;

public class Jokalaria {
	
	//atributuak
	protected String izena;
	protected int pos;
	
	//eraikitzailea
	
	public Jokalaria() 
	{
		this.izena = Teklatua.getTeklatua().getIzena();
		this.pos = 1;
	}
	
	public void aukeratuBidea(int pBideMax)
	{
		this.pos = Teklatua.getTeklatua().aukeratuBidea(pBideMax);
	}
	
	public int getPosizioa()
	{
		return this.pos;
	}
}
