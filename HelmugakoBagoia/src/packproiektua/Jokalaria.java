package packproiektua;

public class Jokalaria {
	
	//atributuak
	private String izena;
	private int pos;
	
	//eraikitzailea
	
	public Jokalaria() 
	{
		this.izena = Teklatua.getIzena();
		this.pos = 1;
	}
	
	public void aukeratuBidea(int pBideMax)
	{
		this.pos = Teklatua.aukeratuBidea(pBideMax);
	}
	
	public int getPosizioa()
	{
		return this.pos;
	}
	
	
}
