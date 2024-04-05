package packproiektua;

import java.util.Scanner;

public class Teklatua {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String getIzena() {
		String izena;
		System.out.println("Idatzi zure izena: ");
		izena = scanner.nextLine();
		return izena;
	}
	
	public static int aukeratuBidea(int pBideMax)
	{
		
		System.out.println("aukeratu zure bidea 1-etik " + pBideMax + "-era: ");
		return scanner.nextInt();
	}

}
