package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TrenbideAsko extends TrenbideZatia
{
	private ArrayList<ZatiMota>lista;
	private final Random r = new Random();
	
	public TrenbideAsko(int pZatiKop)
	{
		this.lista = new ArrayList<ZatiMota>();
		
		int i = 0;
		int randomOztPos = r.nextInt(pZatiKop);//oztopoaren posizioa
		int randomDiruaPos = r.nextInt(pZatiKop);//txanponaren posizioa
		while(randomDiruaPos == randomOztPos)
		{
			randomDiruaPos = r.nextInt(pZatiKop);
		}
		int randomDiruaBalioa = 1 + r.nextInt(10);//txanponaren balioa 1-5era
	//	System.out.println(randomDiruaBalioa);
		//System.out.println(randomDiruaPos);
		//System.out.println(randomOztPos);
		while(i < pZatiKop)
		{
			if(i == randomOztPos)
			{
				if(this.lapurraDa())
				{
					Lapurra la = new Lapurra();
					this.lista.add(la);
				}
				else
				{
					Oztopoa oz = new Oztopoa();
					this.lista.add(oz);
				}
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
	
	private Boolean lapurraDa()
	{
		boolean bada = r.nextBoolean();
		return bada;
	}
	
	private Iterator<ZatiMota> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	protected ZatiMota getZatia(int pPos)
	{
		Iterator<ZatiMota>itr = this.getIteradorea();
		ZatiMota zm = null;
		int i = 0;
		
		while(itr.hasNext() && i<=pPos)
		{
			zm = itr.next();
		}
		return zm;
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
	
	public void inprimatuZatia(int pZatiKop, int pOzt, int pTxan, boolean pLapurra) 
	{
		in.inprimatuAsko(pZatiKop, pOzt, pTxan, pLapurra);
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

	public int getTxanpona() 
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
