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
	
	public void botaSortu()
	{
		Bot bt = new Bot();
		this.lista.add(bt);
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
				System.out.println("\n"+jk.izena + " zure txanda da, aukeratu zure bidea 1-etik " + pZatiKop + "-era: ");
				aukera = jk.aukeratuBidea(pZatiKop) - 1;
				if(jk instanceof Bot)
				{
					System.out.print(jk.pos + "\n");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(ta.oztopoaDago() == aukera)
				{
					jk.galdu = true;
				}
				if(ta.txanponaDago() == aukera)
				{
					jk.txanponak += ta.getTxanpona(aukera);
				}
			}
			System.out.println("------------------------------------------------------\n"
					         + "------------------------------------------------------");
			ta.inprimatuZatia(pZatiKop, ta.oztopoaDago(), ta.txanponaDago());
			this.inprimatuTxanponak();
			this.ezabatuJokalariak();
			txanda ++;
		}
		System.out.println("Irabazlea "+ this.lista.get(0).izena +" da.");
		System.out.print("         ,----,                                                                     \r\n"
				+ "       .'   .`|                                                                ,-.  \r\n"
				+ "    .'   .'   ;                   ,--,                                     ,--/ /|  \r\n"
				+ "  ,---, '    .' ,---.    __  ,-.,--.'|    ,---.        ,---,             ,--. :/ |  \r\n"
				+ "  |   :     ./ '   ,'\\ ,' ,'/ /||  |,    '   ,'\\   ,-+-. /  |            :  : ' /   \r\n"
				+ "  ;   | .'  / /   /   |'  | |' |`--'_   /   /   | ,--.'|'   |  ,--.--.   |  '  /    \r\n"
				+ "  `---' /  ; .   ; ,. :|  |   ,',' ,'| .   ; ,. :|   |  ,\"' | /       \\  '  |  :    \r\n"
				+ "    /  ;  /  '   | |: :'  :  /  '  | | '   | |: :|   | /  | |.--.  .-. | |  |   \\   \r\n"
				+ "   ;  /  /--,'   | .; :|  | '   |  | : '   | .; :|   | |  | | \\__\\/: . . '  : |. \\  \r\n"
				+ "  /  /  / .`||   :    |;  : |   '  : |_|   :    ||   | |  |/  ,\" .--.; | |  | ' \\ \\ \r\n"
				+ "./__;       : \\   \\  / |  , ;   |  | '.'\\   \\  / |   | |--'  /  /  ,.  | '  : |--'  \r\n"
				+ "|   :     .'   `----'   ---'    ;  :    ;`----'  |   |/     ;  :   .'   \\;  |,'     \r\n"
				+ ";   |  .'                       |  ,   /         '---'      |  ,     .-./'--'       \r\n"
				+ "`---'                            ---`-'                      `--`---'               ");
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
	
	private void inprimatuTxanponak()
	{
		System.out.println("\n\nWallet: ");
		Iterator<Jokalaria>itr = getIteradorea();
		
		while(itr.hasNext())
		{
			Jokalaria jk = itr.next();
			System.out.println(jk.izena +": "+jk.txanponak + " €");
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
