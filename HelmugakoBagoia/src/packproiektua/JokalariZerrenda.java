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
	
	public void jokatu()
	{
		int txanda = 1;
		while(this.lista.size() > 1)
		{
			System.out.println(txanda +". txanda.");
			
			Iterator<Jokalaria>itr = getIteradorea();
			
			while(itr.hasNext())
			{
				Jokalaria jk = itr.next();
				jk.aukeratuBidea(3);
				int posi = jk.getPosizioa();
				TrenbideZerrenda.getTrenbideZerrenda().jokatu(posi, txanda);
			}
			TrenbideZerrenda.getTrenbideZerrenda().inprimatuZatia(txanda);
			ezabatuJokalariak();
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
	
}
