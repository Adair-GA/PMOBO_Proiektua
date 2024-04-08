package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TrenbideAsko extends TrenbideZatia
{
	ArrayList<ZatiMota>lista;
	private final Random r = new Random();
	
	public TrenbideAsko(int zatiKop)
	{
		int i = 1;
		int randomOztPos = r.nextInt(zatiKop);//oztopoaren posizioa
		int randomDiruaPos = r.nextInt(zatiKop);//txanponaren posizioa
		int randomDiruaBalioa = r.nextInt(5);//txanponaren balioa 1-5era
		while(i <= zatiKop)
		{
			if(i == randomOztPos)
			{
				Oztopoa oz = new Oztopoa();
				this.lista.add(oz);
			}
			else if (i == randomDiruaPos)
			{
				Dirua di = new Dirua(randomDiruaBalioa);
				this.lista.add(di);
			}
			else
			{
				ZatiMota zm = new ZatiMota();
				this.lista.add(zm);
			}
		}
	}
	
	private Iterator<ZatiMota> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	protected boolean oztopoaDago(int aukera)
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int i = 1;
		boolean badago = false;
		
		while(itr.hasNext() && i < aukera)
		{
			i++;
		}
		ZatiMota zm = itr.next();
		if(zm instanceof Oztopoa)
		{
			badago = true;
		}
		return badago;
	}
	
	@Override
	public void inprimatuZatia() 
	{
		// TODO Auto-generated method stub
		Inprimatzailea.inprimatuAsko();
	}

	public boolean txanponaDago(int aukera) 
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int i = 1;
		boolean badago = false;
		
		while(itr.hasNext() && i < aukera)
		{
			i++;
		}
		ZatiMota zm = itr.next();
		if(zm instanceof Dirua)
		{
			badago = true;
		}
		return badago;
	}

	public int getTxanpona(int aukera) 
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int i = 1;
		
		while(itr.hasNext() && i < aukera)
		{
			i++;
		}
		ZatiMota zm = itr.next();
		return ((Dirua) zm).getBalioa();
	}

}
