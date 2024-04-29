package packproiektua;

public class Jokalaria {
	
	//atributuak
	private String izena;
	private int pos;
	private int txanponak;
	private boolean galdu;
	
	//eraikitzailea
	
	public Jokalaria() 
	{
		this.pos = 1;
		this.txanponak = 0;
		this.galdu = false;
		//this.izenaAukeratu();
	}
	
	public void izenaAukeratu()
	{
		this.izena = Teklatua.getTeklatua().getIzena();
		
	}
	public int aukeratuBidea(int pBideMax)
	{
		return Teklatua.getTeklatua().aukeratuBidea(pBideMax);
	}
	
	public int getPosizioa()
	{
		return this.pos;
	}
	
	public void setPosizioa(int pPos)
	{
		this.pos = pPos;
	}
	
	public void gehituTxanponak(int pTxanponak)
	{
		this.txanponak += pTxanponak;
	}
	
	public void setIzena(String pIzena)
	{
		this.izena = pIzena;
	}

	public String getIzena() {
		return this.izena;
	}

	public boolean getGaldu() {
		return this.galdu;
	}

	public int getTxanponak() {
		return this.txanponak;
	}

	public void kenduTxanponak(int diruaBalioa) {
		this.txanponak -= diruaBalioa;	
	}

	public void setGaldu(boolean b) {
		this.galdu = b;
		
	}
}
