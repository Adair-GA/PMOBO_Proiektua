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
		this.lista.add(jk);
	}
	
	//Trenbidea jokoa aurrera joan ahala sortzen da:
	
	public void jokatu(int pZatiKop)
	{
		int txanda = 1, aukera;
		Iterator<Jokalaria>itr;
		
		while(this.lista.size() > 1)
		{
			System.out.println(txanda +". txanda");
			
			TrenbideBat tb = new TrenbideBat();
			tb.inprimatuZatia();
			TrenbideAsko ta = new TrenbideAsko(pZatiKop);
			itr = getIteradorea();
			while(itr.hasNext())
			{
				Jokalaria jk = itr.next();
				System.out.println(jk.izena + " zure txanda da, aukeratu zure bidea 1-etik " + pZatiKop + "-era: ");
				aukera = jk.aukeratuBidea(pZatiKop);
				if(ta.oztopoaDago(aukera))
				{
					jk.galdu = true;
				}
				if(ta.txanponaDago(aukera))
				{
					jk.txanponak += ta.getTxanpona(aukera);
				}
			}
			ta.inprimatuZatia();
			this.ezabatuJokalariak();
			txanda ++;
		}
		System.out.println("Irabazlea "+ this.lista.get(0)+" da. ZORIONAK!!");
	}
	
	private void ezabatuJokalariak()
	{
		System.out.println("Txanda honetan hurrengo jokalariak galdu dute: ");
		Iterator<Jokalaria>itr = getIteradorea();
		
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			if(jk.galdu == true)
			{
				System.out.println("--> "+ jk.izena);
				itr.remove();
			}
		}
	}
	
	//Trenbidea jokoaren hasiera sortuta:
	/*public void jokatu()
	{
		int txanda = 1, pos = 0;
		Iterator<Jokalaria>itr;
		TrenbideZerrenda tz = TrenbideZerrenda.getTrenbideZerrenda();
		if(tz.zatiaLortu(pos) instanceof TrenbideBat)
		{
			tz.inprimatuZatia(pos);
			System.out.println("Jarraitzen duten jokalariak hurrengoak dira: ");
			itr = getIteradorea();
			while(itr.hasNext())
			{
				Jokalaria jk = itr.next();
				System.out.println("--> " + jk.izena);
			}
			pos ++;
		}
		else 
		{
			while(this.lista.size() > 1)
			{
				System.out.println(txanda +". txanda.");
				
				itr = getIteradorea();
				
				while(itr.hasNext())
				{
					Jokalaria jk = itr.next();
					jk.aukeratuBidea(3);
					int aukera = jk.getPosizioa();
					tz.jokatu(aukera, pos);
				}
				tz.inprimatuZatia(pos);
				ezabatuJokalariak();
				txanda ++;
				pos++;
			}
		}
		System.out.println("Irabazlea "+ this.lista.get(0)+" da. ZORIONAK!!");
	}*/
	
}
