package packproiektua;

import java.util.Scanner;

import packexceptions.NotInRangeException;
import packexceptions.NotIntException;

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
	
	public int aukeratuBidea(int pBideMax) throws NotIntException, NotInRangeException
	{
		if(!scanner.hasNextInt())
		{
			scanner.next();
			throw new NotIntException();
		}
		int bidea = scanner.nextInt();
		if(bidea < 1 || bidea > pBideMax)
		{
			throw new NotInRangeException();
		}
		return bidea;
	}
	
	public int aukeratuInt()
	{
		if(!scanner.hasNextInt())
		{
			scanner.next();
			System.out.println("Sartu zenbaki bat mesedez: \n");
		}
		int zenb = scanner.nextInt();
		return zenb;
	}
	

}
