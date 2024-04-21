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
		bt.izenaAukeratu();
		this.lista.add(bt);
	}
	
	
	private void ezabatuJokalariak()
	{
		Iterator<Jokalaria>itr = getIteradorea();
		Jokalaria jk = null;
		int galdu = 0;
		
		while(itr.hasNext())
		{
			jk = itr.next();
			if(jk.galdu == true)
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
				if(jk.galdu == true)
				{
					System.out.println("--> "+ jk.izena);
					itr.remove();
				}
			}
		}
		
		
	}
	
	private void inprimatuTxanponak()
	{
		System.out.println("\n\nWallet: ");
		Iterator<Jokalaria>itr = getIteradorea();
		
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			System.out.println(jk.izena +": "+jk.txanponak + " 💰");
		}
	}
	
	private void norDaDirudunena()
	{
		Iterator<Jokalaria>itr;
		Jokalaria irabazlea = null, jk = null;
		int txanponMax = 0, txanponak;
		int pos = 0;
		
		itr = getIteradorea();
		while (itr.hasNext())
		{
			jk = itr.next();
			txanponak = this.lista.get(pos).txanponak;
			if (txanponak > txanponMax)
			{
				txanponMax = txanponak;
				irabazlea = jk;
			}
			pos ++;
		}
		System.out.println("Irabazlea "+ irabazlea.izena +" da.");
	}
	
	private void jokalariakJokatu(TrenbideAsko pTa, int pZatiKop, int pTxanda)
	{
		int aukera;
		Iterator<Jokalaria>itr;
		
		itr = this.getIteradorea();
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			System.out.print("\n"+jk.izena + " zure txanda da, aukeratu zure bidea 1-etik " + pZatiKop + "-era: ");
			aukera = jk.aukeratuBidea(pZatiKop) - 1;
			if(jk instanceof Bot)
			{
				System.out.print(jk.pos + "\n");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(pTa.oztopoaDago() == aukera)
			{
				if(pTa.getZatia(pTxanda * 2) instanceof Lapurra)
				{
					if(jk.txanponak >= ((Lapurra) pTa.getZatia(pTxanda * 2)).getDiruaBalioa())
					{
						jk.txanponak -= ((Lapurra) pTa.getZatia(pTxanda * 2)).getDiruaBalioa();
					}
					else
					{
						jk.galdu = true;
					}
				}
				else
				{
					jk.galdu = true;
				}
			}
			if(pTa.txanponaDago() == aukera)
			{
				jk.txanponak += pTa.getTxanpona(aukera);
			}
		}
		
	}
	
	//trenbidea sortuta dago
	protected int jokatu(int pZatiKop, int txandaMax)
	{
		TrenbideZerrenda tz = TrenbideZerrenda.getTrenbideZerrenda(txandaMax, pZatiKop); 
		TrenbideBat tb = null;
		TrenbideAsko ta = null;
		int txanda = 1;
		
		while(this.lista.size() > 1 && txanda <= txandaMax)
		{
			if(txanda < 10)
			{
				System.out.println("\n"+
						"       ╔═════════════════╗"+"\n"+
						"       ║    " + txanda +". txanda" + "    ║"+"\n"+
						"       ╚═════════════════╝\n");
			}
			else
			{
				System.out.println("\n"+
						"       ╔═════════════════╗"+"\n"+
						"       ║    " + txanda +". txanda" + "   ║"+"\n"+
						"       ╚═════════════════╝\n");	
			}
			
			tb = (TrenbideBat) tz.zatiaLortu(txanda * 2 - 1);
			tb.inprimatuZatia();
			ta = (TrenbideAsko) tz.zatiaLortu(txanda * 2);
			
			jokalariakJokatu(ta, pZatiKop, txanda);
			System.out.println();
			
			ta.inprimatuZatia(pZatiKop, ta.oztopoaDago(), ta.txanponaDago(), ta.getZatia(txanda * 2)instanceof Lapurra);
			this.inprimatuTxanponak();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.ezabatuJokalariak();
			txanda ++;
		}
		
		if (this.lista.size() > 1)
		{
			this.norDaDirudunena();
			return 0;
		}
		
		if(this.lista.size() == 0)
		{
			System.out.println("Jokalari guztiek galdu dute");
			return 1;
		}
		else
		{
			Jokalaria irabazlea = null;
			irabazlea = this.lista.get(0);
			System.out.println("Irabazlea "+ irabazlea.izena +" da.");
			return 0;
		}
	}
	
}
