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
	
	public static TrenbideZerrenda getTrenbideZerrenda() {
		if (nireTrenbideZerrenda==null) {
			nireTrenbideZerrenda=new TrenbideZerrenda();}
		return nireTrenbideZerrenda;
	}
	
	private Iterator <TrenbideZatia> getIteradorea(){
		return this.lista.iterator();
	}
	
//	public TrenbideZatia zatiaLortu() 
//	{
//		Iterator <TrenbideZatia> itr=this.getIteradorea();
//		while(itr.hasNext()) 
//		{
//			TrenbideZatia zati=itr.next();
//			return zati;
//		}
//	}
}
