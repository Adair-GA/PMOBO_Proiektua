package packproiektua;

import java.util.Scanner;

public class Teklatua {
	
	private static Teklatua nireTeklatua = new Teklatua();
	private Scanner scanner;
	
	private Teklatua()
	{
		scanner = new Scanner(System.in);
	}
	
	public static Teklatua getTeklatua()
	{
		return nireTeklatua;
	}
	
	public void getReturn()
	{
		String input;
		input = scanner.nextLine();
		while(!input.equals(""))
		{
			input = scanner.nextLine();
		}
	}
	
	public String getString(String pString) 
	{
		System.out.println(pString);
		return scanner.nextLine();
	}
	
	public int aukeratuBidea(int pBideMax)
	{
		while(!scanner.hasNextInt())
		{
			scanner.next();
			System.out.println("Sartu zenbaki bat mesedez: \n");
		}
		int bidea = scanner.nextInt();
		while(bidea < 1 || bidea > pBideMax)
		{
			System.out.println("Ez da existitzen aukeratu duzun bidea, mesedez beste zenbaki bat sartu: \n");
			while(!scanner.hasNextInt())
			{
				scanner.next();
				System.out.println("Sartu zenbaki bat mesedez: \n");
			}
			bidea = scanner.nextInt();
			
		}
		return bidea;
	}
	
	public int aukeratuInt()
	{
		while(!scanner.hasNextInt())
		{
			scanner.next();
			System.out.println("Sartu zenbaki bat mesedez: \n");
		}
		int zenb = scanner.nextInt();
		return zenb;
	}
	

}
