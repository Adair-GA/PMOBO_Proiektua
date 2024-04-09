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


	public static void inprimatuAsko(int pZatiKop, int pOzt, int pTxan) 
	{
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= pZatiKop)
		{
			if(i == pOzt)
			{
				System.out.print(" --- ");
			}
			else if(i == pTxan)
			{
				System.out.print(" o ");
			}
			else
			{
				System.out.print(" |-| ");
			}
			i++;
		}
	}

}
