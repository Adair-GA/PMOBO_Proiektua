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
		this.lista = new ArrayList<ZatiMota>();
		
		int i = 0;
		int randomOztPos = r.nextInt(zatiKop);//oztopoaren posizioa
		int randomDiruaPos = r.nextInt(zatiKop);//txanponaren posizioa
		while(randomDiruaPos == randomOztPos)
		{
			randomDiruaPos = r.nextInt(zatiKop);
		}
		int randomDiruaBalioa = 1 + r.nextInt(5);//txanponaren balioa 1-5era
		System.out.println(randomDiruaBalioa);
		while(i < zatiKop)
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
			i++;
		}
	}
	
	private Iterator<ZatiMota> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	protected int oztopoaDago()
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int i = -1;
		boolean badago = false;
		
		while(itr.hasNext() && !badago)
		{
			i++;
			ZatiMota zm = itr.next();
			if(zm instanceof Oztopoa)
			{
				badago = true;
			}
		}
		return i;
	}
	
	public void inprimatuZatia(int pZatiKop, int pOzt, int pTxan) 
	{
		// TODO Auto-generated method stub
		Inprimatzailea.inprimatuAsko(pZatiKop, pOzt, pTxan);
	}

	public int txanponaDago() 
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int i = -1;
		boolean badago = false;
		
		while(itr.hasNext() && !badago)
		{
			i++;
			ZatiMota zm = itr.next();
			if(zm instanceof Dirua)
			{
				badago = true;
			}
		}
		return i;
	}

	public int getTxanpona(int aukera) 
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		int dirua = 0;
		boolean badago = false;
		
		while(itr.hasNext() && !badago)
		{
			ZatiMota zm = itr.next();
			if(zm instanceof Dirua)
			{
				dirua = ((Dirua)zm).getBalioa();
				badago = true;
			}
		}
		return dirua;
	}

	@Override
	public void inprimatuZatia() {
		// TODO Auto-generated method stub
		
	}

}
