package packproiektua;

import packexceptions.NotInRangeException;
import packexceptions.NotIntException;

public class Jokalaria implements Comparable{
	
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
		this.izena = Teklatua.getTeklatua().getString("Idatzi zure izena: ");
		
	}
	public int aukeratuBidea(int pBideMax)
	{
		try {
			return Teklatua.getTeklatua().aukeratuBidea(pBideMax);
		} catch (NotInRangeException e) {
			System.out.println("Error: Aukeratu bide egoki bat. 1-etik "+ pBideMax + "-era.");
			return this.aukeratuBidea(pBideMax);
		} catch(NotIntException e) {
			System.out.println("Error: Zenbaki bat aukeratu mesedez.");
			return this.aukeratuBidea(pBideMax);
		}
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

	public void setGaldu(boolean pB) {
		this.galdu = pB;
		
	}

	@Override
	public int compareTo(Object o) {
		Jokalaria other = (Jokalaria) o;
		return Integer.compare(this.txanponak, other.txanponak);
	}
}
