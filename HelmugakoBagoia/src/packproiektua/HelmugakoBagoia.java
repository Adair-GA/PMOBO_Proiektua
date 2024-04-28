package packproiektua;

public class HelmugakoBagoia {
	
	
	public void partidaHasi()
	{
		//Hasieraketak--------------------------------------------------------------------
		Teklatua t = Teklatua.getTeklatua();
		int botKop = 0, joKop = 0, biaKop=0, i = 0, txandaMax = 0;
		JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
		String pString;
		Bozgorailua bz = Bozgorailua.getBozgorailua();
		Inprimatzailea in = Inprimatzailea.getInprimatzailea();
		bz.backMusicHasi();
		boolean musicOn = true;
		
		
		//Hasierako testua----------------------------------------------------------------	
		System.out.print(" ___ ___ _______ ___     ___ ___ ___ ___ _______ _______ ___ ___  _______     _______  _______ _______ _______ ___ _______ \r\n"
				+ " |   Y   |   _   |   |   |   Y   |   Y   |   _   |   _   |   Y   )|   _   |   |   _   \\|   _   |   _   |   _   |   |   _   |\r\n"
				+ " |.  1   |.  1___|.  |   |.      |.  |   |.  |___|.  1   |.  1  / |.  |   |   |.  1   /|.  1   |.  |___|.  |   |.  |.  1   |\r\n"
				+ " |.  _   |.  __)_|.  |___|. \\_/  |.  |   |.  |   |.  _   |.  _  \\ |.  |   |   |.  _   \\|.  _   |.  |   |.  |   |.  |.  _   |\r\n"
				+ " |:  |   |:  1   |:  1   |:  |   |:  1   |:  1   |:  |   |:  |   \\|:  1   |   |:  1    |:  |   |:  1   |:  1   |:  |:  |   |\r\n"
				+ " |::.|:. |::.. . |::.. . |::.|:. |::.. . |::.. . |::.|:. |::.| .  |::.. . |   |::.. .  |::.|:. |::.. . |::.. . |::.|::.|:. |\r\n"
				+ " `--- ---`-------`-------`--- ---`-------`-------`--- ---`--- ---'`-------'   `-------'`--- ---`-------`-------`---`--- ---'\r\n"
				+ " v0.0.0                                                                                              © 2024 Java Adventurers\r\n\n");
		System.out.print("                                        "
				+ "\n    ╔═════════════════════════════════════╗╔═════════════════════════════════════╗╔════════════════════════════════╗"
				+ "\n    ║             1.botoia:               ║║             2. botoia:              ║║            3.botoia:           ║"
				+ "\n    ║         Partidarekin hasi           ║║            Instrukzioak             ║║      Bolumena kendu/jarri      ║"
				+ "\n    ╚═════════════════════════════════════╝╚═════════════════════════════════════╝╚════════════════════════════════╝\n");
		
		int botoia = t.aukeratuInt();
		while(botoia != 1)
		{
			if(botoia == 3)
			{
				if(musicOn)
				{
					bz.backMusicPausatu();
					musicOn = false;
				}
				else
				{
					bz.backMusicHasi();
					musicOn = true;
				}
			}
			else if(botoia == 2)
			{
				pString = "Ongi etorri Helmugako Bagoiara!\n"
						+ "Tren hau oso berezia da, izan ere, norberak erabakitzen du hartu nahi duen bidea. Bidai honetan zehar hainbat alditan erabaki "
						+ "\nbeharko duzu zein bidetik joango zaren eta zorte izanez gero, dirua lortuko duzu, partida irabaztea ahalbidetuko dizuna."
						+ "\nBAINA KONTUZ!! Trenbide zati batzuk apurtu dira eta ezin izango zara bertatik pasatu."
						+ "\nGainera lapurrak agertu dira azkenaldian. Dirua izan ezean haserretuko dira, beraz kontuz."
						+ "\nPrest zaudete helmugara heltzeko?"
						+ "\nTrenak hurrengo helmugak ditu:\n\n"
						+ "--> Bilbo: 3 biako trena.\n"
						+ "--> Donostia: 4 biako trena.\n"
						+ "--> Gasteiz: 5 biako trena.\n"
						+ "--> Ondarru: 6 biako trena.\n"
						+ "--> Balmaseda: 7 biako trena.\n"
						+ "--> Laudio: 8 biako trena.\n"
						+ "--> Txurdinaga: 9 biako trena.\n"
						+ "--> Londres: 10 biako trena.\n"
						+ "\nZorte on adventurers!"
						+ "\n\nSakatu 1 partidarekin hasteko...\n";
				in.idazketaAnimazioa(pString);
			}
			botoia = t.aukeratuInt();
		}
		t.getReturn();
		
		pString = "Ongi etorri Helmugako Bagoiara!!";
		in.idazketaAnimazioa(pString);
		
		//aukerak---------------------------------------------------------
		pString = "\nAukeratu zure helmuga, bia kopuruarekin: ";
		in.idazketaAnimazioa(pString);
		biaKop = t.aukeratuInt();
		while(biaKop < 3 || biaKop > 10)
		{
			in.idazketaAnimazioa("Sartutako bia kopurua ez da nahikoa jolasarekin hasteko, mesedez, 3 edo gehiago edo 10 baino gutxiago aukeratu: ");
			biaKop = t.aukeratuInt();
		}
		
		pString = "\nAukeratu zenbat jokalari dauden: ";
		in.idazketaAnimazioa(pString);
		joKop = t.aukeratuInt();
		while(joKop < 1)
		{
			in.idazketaAnimazioa("Gutxienez jokalari bat aukeratu behar da: ");
			joKop = t.aukeratuInt();			
		}
		
		pString = "\nAukeratu zenbat bot nahi dituzun: ";
		in.idazketaAnimazioa(pString);
		botKop = t.aukeratuInt();
		
		txandaMax = ((botKop + joKop)*2 + biaKop * 3)/2;
		System.out.println();
		t.getReturn();
		
		
		//Jokalari zerrenda sortu-----------------------------------------------------------
		while(i < joKop)
		{
			jz.jokalariaSortu();
			i++;
		}
	
		i = 0;
		while(i<botKop)
		{
			jz.botaSortu();
			i++;
		}
	
		System.out.println("Hurrengo partidak " + txandaMax + " txanda izango ditu.\n");
		int irabazlerik = this.jokatu(biaKop, txandaMax);
	
		if (irabazlerik == 0)
		{
			in.zorionakIdatzi();
		}
		bz.backMusicItzali();
	}
	
	private int jokatu(int pBiaKop, int pTxandaMax) 
	{
		JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
		TrenbideZerrenda tz = TrenbideZerrenda.getTrenbideZerrenda(pTxandaMax, pBiaKop); 
		TrenbideBat tb = null;
		TrenbideAsko ta = null;
		int txanda = 1;
		
		
		while(jz.getZerrendaLuzera() > 1 && txanda <= pTxandaMax)
		{
			if(txanda < 10)
			{
				System.out.println("\n"+
						"       ╔═════════════════╗"+"\n"+
						"       ║    " + txanda +". txanda" + "    ║"+"\n"+
						"       ╚═════════════════╝\n");
			}
			else
			{
				System.out.println("\n"+
						"       ╔═════════════════╗"+"\n"+
						"       ║    " + txanda +". txanda" + "   ║"+"\n"+
						"       ╚═════════════════╝\n");	
			}
			
			tb = (TrenbideBat) tz.zatiaLortu(txanda * 2 - 1);
			tb.inprimatuZatia();
			ta = (TrenbideAsko) tz.zatiaLortu(txanda * 2);
			
			jz.jokalariakJokatu(ta, pBiaKop, txanda);
			System.out.println();
			
			ta.inprimatuZatia(pBiaKop, ta.oztopoaDago(), ta.txanponaDago(), ta.getZatia(txanda * 2)instanceof Lapurra);
			jz.inprimatuTxanponak();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jz.ezabatuJokalariak();
			txanda ++;
		}
		
		if (jz.getZerrendaLuzera() > 1)
		{
			jz.norDaDirudunena();
			return 0;
		}
		
		if(jz.getZerrendaLuzera() == 0)
		{
			System.out.println("Jokalari guztiek galdu dute");
			return 1;
		}
		else
		{
			Jokalaria irabazlea = null;
			irabazlea = jz.jokalariaBueltatu(0);
			System.out.println("Irabazlea "+ irabazlea.getIzena() +" da.");
			return 0;
		}
	}
	

}
