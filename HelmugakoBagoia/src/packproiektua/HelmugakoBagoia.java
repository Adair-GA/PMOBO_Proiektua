package packproiektua;

public class HelmugakoBagoia 
{
	public void jokatu()
	{
		int botKop = 0, joKop = 0, biaKop=0, i = 0;
		JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
		System.out.println(" __    __            __                                              __                        __                                      __           \r\n"
				+ "/  |  /  |          /  |                                            /  |                      /  |                                    /  |          \r\n"
				+ "$$ |  $$ |  ______  $$ | _____  ____   __    __   ______    ______  $$ |   __   ______        $$ |____    ______    ______    ______  $$/   ______  \r\n"
				+ "$$ |__$$ | /      \\ $$ |/     \\/    \\ /  |  /  | /      \\  /      \\ $$ |  /  | /      \\       $$      \\  /      \\  /      \\  /      \\ /  | /      \\ \r\n"
				+ "$$    $$ |/$$$$$$  |$$ |$$$$$$ $$$$  |$$ |  $$ |/$$$$$$  | $$$$$$  |$$ |_/$$/ /$$$$$$  |      $$$$$$$  | $$$$$$  |/$$$$$$  |/$$$$$$  |$$ | $$$$$$  |\r\n"
				+ "$$$$$$$$ |$$    $$ |$$ |$$ | $$ | $$ |$$ |  $$ |$$ |  $$ | /    $$ |$$   $$<  $$ |  $$ |      $$ |  $$ | /    $$ |$$ |  $$ |$$ |  $$ |$$ | /    $$ |\r\n"
				+ "$$ |  $$ |$$$$$$$$/ $$ |$$ | $$ | $$ |$$ \\__$$ |$$ \\__$$ |/$$$$$$$ |$$$$$$  \\ $$ \\__$$ |      $$ |__$$ |/$$$$$$$ |$$ \\__$$ |$$ \\__$$ |$$ |/$$$$$$$ |\r\n"
				+ "$$ |  $$ |$$       |$$ |$$ | $$ | $$ |$$    $$/ $$    $$ |$$    $$ |$$ | $$  |$$    $$/       $$    $$/ $$    $$ |$$    $$ |$$    $$/ $$ |$$    $$ |\r\n"
				+ "$$/   $$/  $$$$$$$/ $$/ $$/  $$/  $$/  $$$$$$/   $$$$$$$ | $$$$$$$/ $$/   $$/  $$$$$$/        $$$$$$$/   $$$$$$$/  $$$$$$$ | $$$$$$/  $$/  $$$$$$$/ \r\n"
				+ "                                                /  \\__$$ |                                                        /  \\__$$ |                        \r\n"
				+ "                                                $$    $$/                                                         $$    $$/                         \r\n"
				+ "                                                 $$$$$$/                                                           $$$$$$/                          ");
		System.out.print("Aukeratu zenbat bia nahi dituzun: ");
		biaKop = Teklatua.getTeklatua().aukeratuInt();
		while(biaKop < 3)
		{
			System.out.println("Sartutako bia kopurua ez da nahikoa jolasarekin hasteko, mesedez, 3 edo gehiago aukeratu: ");
			biaKop = Teklatua.getTeklatua().aukeratuInt();
		}
		
		System.out.print("\nAukeratu zenbat jokalari dauden: ");
		joKop = Teklatua.getTeklatua().aukeratuInt();
		while(joKop < 1)
		{
			System.out.print("\nGutxienez jokalari bat aukeratu behar da: ");
			joKop = Teklatua.getTeklatua().aukeratuInt();			
		}
		
		System.out.print("\nAukeratu zenbat bot nahi dituzun: ");
		botKop = Teklatua.getTeklatua().aukeratuInt();
		
		while(i<botKop)
		{
			jz.botaSortu();
			i++;
		}
		i = 0;
		while(i < joKop)
		{
			jz.jokalariaSortu();
			i++;
		}
		
		jz.jokatu(biaKop);
	}

}
