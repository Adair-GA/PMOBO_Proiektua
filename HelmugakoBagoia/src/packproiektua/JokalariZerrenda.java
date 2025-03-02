package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;


public class JokalariZerrenda {
	
	private ArrayList<Jokalaria>lista;
	private static JokalariZerrenda nireJokalariZerrenda = null;
	
	private JokalariZerrenda()
	{
		this.lista = new ArrayList<Jokalaria>();
	}
	
	public static JokalariZerrenda getJokalariZerrenda()
	{
		if (nireJokalariZerrenda == null)
		{
			nireJokalariZerrenda = new JokalariZerrenda();
		}
		return nireJokalariZerrenda;
	}
	
	private Iterator<Jokalaria> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	public void jokalariaSortu()
	{
		Jokalaria jk = new Jokalaria();
		jk.izenaAukeratu();
		this.lista.add(jk);
	}
	
	public void botaSortu()
	{
		Bot bt = new Bot();
		this.lista.add(bt);
	}
	
	public int getZerrendaLuzera()
	{
		return this.lista.size();
	}
	
	public Jokalaria jokalariaBueltatu(int pPos)
	{
		return this.lista.get(pPos);
	}
	
 	public void ezabatuJokalariak()
	{
		Iterator<Jokalaria>itr = getIteradorea();
		Jokalaria jk = null;
		int galdu = 0;
		
		while(itr.hasNext())
		{
			jk = itr.next();
			if(jk.getGaldu() == true)
			{
				galdu ++;
			}
		}
		
		if(galdu >= 1)
		{
			System.out.println("Txanda honetan hurrengo jokalariak galdu dute: ");
			itr = getIteradorea();
			while(itr.hasNext())
			{
				jk = itr.next();
				if(jk.getGaldu() == true)
				{
					System.out.println("--> "+ jk.getIzena());
					itr.remove();
				}
			}
		}
		
		
	}
	
	public void inprimatuTxanponak()
	{
		System.out.println("\n\nWallet: ");
		Iterator<Jokalaria>itr = getIteradorea();
		
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			System.out.println(jk.getIzena() +": "+jk.getTxanponak() + " 💰");
		}
	}
	
	public void norDaDirudunena()
	{
		Iterator<Jokalaria>itr;
		Jokalaria irabazlea = null, jk = null;
		int txanponMax = 0, txanponak;
		
		itr = getIteradorea();
		while (itr.hasNext())
		{
			jk = itr.next();
			txanponak = jk.getTxanponak();
			if (txanponak > txanponMax)
			{
				txanponMax = txanponak;
				irabazlea = jk;
			}
		}
		System.out.println("Irabazlea "+ irabazlea.getIzena() +" da.");
	}
	
	public void jokalariakJokatu(TrenbideAsko pTa, int pZatiKop)
	{
		Iterator<Jokalaria>itr;
		
		itr = this.getIteradorea();
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			System.out.print("\n"+jk.getIzena() + " zure txanda da, aukeratu zure bidea 1-etik " + pZatiKop + "-era: ");
			jk.setPosizioa(jk.aukeratuBidea(pZatiKop)-1);
			if(jk instanceof Bot)
			{
				System.out.print(jk.getPosizioa() + 1 + "\n");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(pTa.oztopoaDago() == jk.getPosizioa())
			{
				if(pTa.getZatia(jk.getPosizioa()) instanceof Lapurra)
				{
					if(jk.getTxanponak() >= ((Lapurra) pTa.getZatia(jk.getPosizioa())).getDiruaBalioa())
					{
						jk.kenduTxanponak(((Lapurra) pTa.getZatia(jk.getPosizioa())).getDiruaBalioa());
					}
					else
					{
						jk.setGaldu(true);
					}
				}
				else
				{
					jk.setGaldu(true);
				}
			}
			if(pTa.txanponaDago() == jk.getPosizioa())
			{
				jk.gehituTxanponak(pTa.getTxanpona());
			}
		}
		
	}
	public void resetZerrenda() {
		nireJokalariZerrenda = null;
	}
	
}
