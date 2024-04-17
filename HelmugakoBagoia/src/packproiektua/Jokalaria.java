package packproiektua;

public class Jokalaria {
	
	//atributuak
	protected String izena;
	protected int pos;
	protected int txanponak;
	protected boolean galdu;
	
	//eraikitzailea
	
	public Jokalaria() 
	{
		this.pos = 1;
		this.txanponak = 0;
		this.galdu = false;
		//this.izena = this.izenaAukeratu();
	}
	
	public void izenaAukeratu()
	{
		this.izena = Teklatua.getTeklatua().getIzena();
		
	}
	public int aukeratuBidea(int pBideMax)
	{
		return this.pos = Teklatua.getTeklatua().aukeratuBidea(pBideMax);
	}
	
	public int getPosizioa()
	{
		return this.pos;
	}
	
	public void gehituTxanponak(int pTxanponak)
	{
		this.txanponak += pTxanponak;
	}
}
