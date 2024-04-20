package packproiektua;

import java.io.File;

import javax.sound.sampled.*;

public class Main 
{
	public static void main(String[] args)
	{
		try {
			String filePath = "C:\\Users\\lucia\\OneDrive\\Escritorio\\HelmugakoBagoia\\HelmugakoBagoia\\src\\backgroundMusic.wav";
			File audioFile = new File(filePath);
			Clip clip = AudioSystem.getClip();
			
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip.open(inputStream);
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
		
		System.out.print(" ___ ___ _______ ___     ___ ___ ___ ___ _______ _______ ___ ___  _______     _______  _______ _______ _______ ___ _______ \r\n"
				+ " |   Y   |   _   |   |   |   Y   |   Y   |   _   |   _   |   Y   )|   _   |   |   _   \\|   _   |   _   |   _   |   |   _   |\r\n"
				+ " |.  1   |.  1___|.  |   |.      |.  |   |.  |___|.  1   |.  1  / |.  |   |   |.  1   /|.  1   |.  |___|.  |   |.  |.  1   |\r\n"
				+ " |.  _   |.  __)_|.  |___|. \\_/  |.  |   |.  |   |.  _   |.  _  \\ |.  |   |   |.  _   \\|.  _   |.  |   |.  |   |.  |.  _   |\r\n"
				+ " |:  |   |:  1   |:  1   |:  |   |:  1   |:  1   |:  |   |:  |   \\|:  1   |   |:  1    |:  |   |:  1   |:  1   |:  |:  |   |\r\n"
				+ " |::.|:. |::.. . |::.. . |::.|:. |::.. . |::.. . |::.|:. |::.| .  |::.. . |   |::.. .  |::.|:. |::.. . |::.. . |::.|::.|:. |\r\n"
				+ " `--- ---`-------`-------`--- ---`-------`-------`--- ---`--- ---'`-------'   `-------'`--- ---`-------`-------`---`--- ---'\r\n"
				+ "Ongi etorri Helmugako Bagoiara!\n"
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
				+ "--> Paris: 9 biako trena.\n"
				+ "--> Londres: 10 biako trena.\n"
				+ "\nZorte on adventurers!"
				+ "\n\nSakatu enter partidarekin hasteko...\n");
		
		Teklatua t = Teklatua.getTeklatua();
		t.getReturn();
		
		int botKop = 0, joKop = 0, biaKop=0, i = 0, txandaMax = 0;
		JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
		
		System.out.print("Aukeratu zure helmuga, bia kopuruarekin: ");
		biaKop = Teklatua.getTeklatua().aukeratuInt();
		while(biaKop < 3 || biaKop > 10)
		{
			System.out.println("Sartutako bia kopurua ez da nahikoa jolasarekin hasteko, mesedez, 3 edo gehiago edo 10 baino gutxiago aukeratu: ");
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
		txandaMax = ((botKop + joKop)*2 + biaKop * 3)/2;
		System.out.println();
		Teklatua.getTeklatua().getReturn();
		
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
		
		System.out.println("Hurrengo partidak " + txandaMax + " izango ditu.");
		int irabazlerik = jz.jokatu(biaKop, txandaMax);
		
		if (irabazlerik == 0)
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
		
		
		clip.stop();
		clip.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	/*public void jokatu()
	{
		int botKop = 0, joKop = 0, biaKop=0, i = 0, txandaMax = 0;
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
		
		
	}

}*/
