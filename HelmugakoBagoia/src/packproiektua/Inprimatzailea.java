package packproiektua;

public class Inprimatzailea {
	
	private static Inprimatzailea nireInprimatzailea = null;
	
	private Inprimatzailea()
	{
	}
	
	public static Inprimatzailea getInprimatzailea()
	{
		if(nireInprimatzailea == null)
		{
			nireInprimatzailea = new Inprimatzailea();
		}
		return nireInprimatzailea;
	}
	
	public void inprimatuBat()
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println("........      |-|      .......");
			i++;
		}
	}


	public void inprimatuAsko(int pZatiKop, int pOzt, int pTxan, boolean pLapurra) 
	{
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		System.out.print("........   ");
		while (i < pZatiKop)
		{
			if(i == pOzt)
			{
				if(pLapurra)
				{
					System.out.print("  🦊 ​");
				}
				else
				{
					System.out.print("  🚧 ");
				}
			}
			else if(i == pTxan)
			{
				System.out.print("  🪙​ ");
			}
			else
			{
				System.out.print(" |-| ");
			}
			i++;
		}
		System.out.print("   ........");
		System.out.println();
		
		while (j < 5)
		{
			i = 0;
			System.out.print("........   ");
			while (i < pZatiKop)
			{
				System.out.print(" |-| ");
				i++;
			}
			System.out.print("   ........");
			System.out.println();
			j ++;
		}
	}
	
	public void idazketaAnimazioa(String pString)
	{
		int j = 0;
		while(j < pString.length())
		{
			System.out.print(pString.charAt(j));
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			j++;
		}
	}
	
	public void zorionakIdatzi()
	{
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

}
