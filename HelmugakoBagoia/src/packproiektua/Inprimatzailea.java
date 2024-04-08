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
	
	public void inprimatu(int pZatiKop, int pOzt)
	{
		int i = 0;
		int j = 0;
		int ozt = pOzt;
		
		while(i < 5)
		{
			while(j < pZatiKop)
			{
				if(i == 0 && j == pOzt)
				{
					System.out.print("|||| ");
				}
				System.out.print("|-|  ");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}

	public static void inprimatuAsko() 
	{
		// TODO Auto-generated method stub
		
	}

}
