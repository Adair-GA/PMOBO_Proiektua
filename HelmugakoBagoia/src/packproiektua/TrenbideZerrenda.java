package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class TrenbideZerrenda {
	//atributuak
	private ArrayList <TrenbideZatia> lista;
	
	//eraikitzailea
	private static TrenbideZerrenda nireTrenbideZerrenda=null;
	
	private TrenbideZerrenda() 
	{
		this.lista = new ArrayList<TrenbideZatia>();
	}
	
	public static TrenbideZerrenda getTrenbideZerrenda() 
	{
		if (nireTrenbideZerrenda==null) {
			nireTrenbideZerrenda=new TrenbideZerrenda();}
		return nireTrenbideZerrenda;
	}
	
	private void trenbideZerrendaSortu()
	{
		
	}
	private Iterator <TrenbideZatia> getIteradorea(){
		return this.lista.iterator();
	}
	
	
	public void inprimatuZatia(int pPos)
	{
		TrenbideZatia tz;
		tz = zatiaLortu(pPos);
		tz.inprimatuZatia();
	}
	
	public TrenbideZatia zatiaLortu(int txanda) 
	{
		Iterator <TrenbideZatia> itr=this.getIteradorea();
		TrenbideZatia zati = null;
		int i = 0;
		
		while(itr.hasNext() && i < txanda) 
		{
			zati=itr.next();
			i++;
		}
		return zati;
	}
}
