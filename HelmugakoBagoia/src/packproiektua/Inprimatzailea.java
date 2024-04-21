package packproiektua;

public class Inprimatzailea {
	
	public static void inprimatuBat()
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println("........      |-|      .......");
			i++;
		}
	}


	public static void inprimatuAsko(int pZatiKop, int pOzt, int pTxan, boolean pLapurra) 
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

}
