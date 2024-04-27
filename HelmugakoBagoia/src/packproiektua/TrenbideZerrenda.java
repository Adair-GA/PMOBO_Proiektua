package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class TrenbideZerrenda {
	//atributuak
	private ArrayList <TrenbideZatia> lista;
	
	//eraikitzailea
	private static TrenbideZerrenda nireTrenbideZerrenda=null;
	
	private TrenbideZerrenda(int txandaMax, int pZatiKop) 
	{
		this.lista = new ArrayList<TrenbideZatia>();
		this.trenbideZerrendaSortu(txandaMax, pZatiKop);
	}
	
	public static TrenbideZerrenda getTrenbideZerrenda(int txandaMax, int pZatiKop) 
	{
		if (nireTrenbideZerrenda==null) {
			nireTrenbideZerrenda = new TrenbideZerrenda(txandaMax, pZatiKop);}
		return nireTrenbideZerrenda;
	}
	
	private void trenbideZerrendaSortu(int txandaMax, int pZatiKop)
	{
		int i = 0;
		while(txandaMax > i)
		{
			this.gehituZatia(pZatiKop);
			i++;
		}
	}
	
	private void gehituZatia(int pZatiKop)
	{
		int trenbideKop = pZatiKop;
		TrenbideBat tb = new TrenbideBat();
		TrenbideAsko ta = new TrenbideAsko(trenbideKop);
		this.lista.add(tb);
		this.lista.add(ta);
	}
	
	private Iterator <TrenbideZatia> getIteradorea(){
		return this.lista.iterator();
	}
	
	
	public TrenbideZatia zatiaLortu(int pos) 
	{
		Iterator <TrenbideZatia> itr=this.getIteradorea();
		TrenbideZatia zati = null;
		int i = 0;
		
		while(itr.hasNext() && i < pos) 
		{
			zati=itr.next();
			i++;
		}
		return zati;
	}
}
