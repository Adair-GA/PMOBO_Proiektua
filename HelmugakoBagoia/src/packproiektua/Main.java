package packproiektua;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main 
{
	public static void main(String[] args)
	{
		try {
			//Soinua----------------------------------------------------------------------
			String filePath = "./src/sounds/backgroundMusic.wav";
			File audioFile = new File(filePath);
			Clip clip = AudioSystem.getClip();
			
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip.open(inputStream);
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			boolean musicOn = true;
			
			//Hasieraketak--------------------------------------------------------------------
			Teklatua t = Teklatua.getTeklatua();
			
			int botKop = 0, joKop = 0, biaKop=0, i = 0, txandaMax = 0, j = 0;
			JokalariZerrenda jz = JokalariZerrenda.getJokalariZerrenda();
			
			//Hasierako testua----------------------------------------------------------------	
			System.out.print(" ___ ___ _______ ___     ___ ___ ___ ___ _______ _______ ___ ___  _______     _______  _______ _______ _______ ___ _______ \r\n"
					+ " |   Y   |   _   |   |   |   Y   |   Y   |   _   |   _   |   Y   )|   _   |   |   _   \\|   _   |   _   |   _   |   |   _   |\r\n"
					+ " |.  1   |.  1___|.  |   |.      |.  |   |.  |___|.  1   |.  1  / |.  |   |   |.  1   /|.  1   |.  |___|.  |   |.  |.  1   |\r\n"
					+ " |.  _   |.  __)_|.  |___|. \\_/  |.  |   |.  |   |.  _   |.  _  \\ |.  |   |   |.  _   \\|.  _   |.  |   |.  |   |.  |.  _   |\r\n"
					+ " |:  |   |:  1   |:  1   |:  |   |:  1   |:  1   |:  |   |:  |   \\|:  1   |   |:  1    |:  |   |:  1   |:  1   |:  |:  |   |\r\n"
					+ " |::.|:. |::.. . |::.. . |::.|:. |::.. . |::.. . |::.|:. |::.| .  |::.. . |   |::.. .  |::.|:. |::.. . |::.. . |::.|::.|:. |\r\n"
					+ " `--- ---`-------`-------`--- ---`-------`-------`--- ---`--- ---'`-------'   `-------'`--- ---`-------`-------`---`--- ---'\r\n"
					+ " v0.0.0                                                                                              © 2024 java Adventurers\r\n\n");
			System.out.print("                                        "
					+ "\n╔═════════════════════════════════════╗╔═════════════════════════════════════╗╔════════════════════════════════╗"
					+ "\n║             1.botoia:               ║║             2. botoia:              ║║            3.botoia:           ║"
					+ "\n║         Partidarekin hasi           ║║            Instrukzioak             ║║      Bolumena kendu/jarri      ║"
					+ "\n╚═════════════════════════════════════╝╚═════════════════════════════════════╝╚════════════════════════════════╝\n");
			
			int botoia = t.aukeratuInt();
			while(botoia != 1)
			{
				if(botoia == 3)
				{
					if(musicOn)
					{
						clip.stop();
						musicOn = false;
					}
					else
					{
						clip.loop(Clip.LOOP_CONTINUOUSLY);
						musicOn = true;
					}
				}
				else if(botoia == 2)
				{
					InputStream fich = null;
					fich = new FileInputStream("./src/fitxategiak/instrukzioak.txt");
					Scanner sc = new Scanner(fich);
					while (sc.hasNextLine())
					{
					String lerroa = sc.nextLine();
					System.out.println(lerroa);
					}
					sc.close();

				}
				botoia = t.aukeratuInt();
			}
			t.getReturn();
		
			String pString = "Ongi etorri Helmugako Bagoiara!\n"
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
					+ "\n\nSakatu enter partidarekin hasteko...\n";
			
			while(j < pString.length())
			{
				System.out.print(pString.charAt(j));
				Thread.sleep(20);
				j++;
			}
			t.getReturn();
		
			//Aukerak-------------------------------------------------------------------------
			pString = "\nAukeratu zure helmuga, bia kopuruarekin: ";
			j = 0;
			while(j < pString.length())
			{
				System.out.print(pString.charAt(j));
				Thread.sleep(50);
				j++;
			}
			biaKop = t.aukeratuInt();
			while(biaKop < 3 || biaKop > 10)
			{
				System.out.println("Sartutako bia kopurua ez da nahikoa jolasarekin hasteko, mesedez, 3 edo gehiago edo 10 baino gutxiago aukeratu: ");
				biaKop = t.aukeratuInt();
			}
		
			pString = "\nAukeratu zenbat jokalari dauden: ";
			j = 0;
			while(j < pString.length())
			{
				System.out.print(pString.charAt(j));
				Thread.sleep(50);
				j++;
			}
			joKop = t.aukeratuInt();
			while(joKop < 1)
			{
				System.out.print("Gutxienez jokalari bat aukeratu behar da: ");
				joKop = t.aukeratuInt();			
			}
		
			pString = "\nAukeratu zenbat bot nahi dituzun: ";
			j = 0;
			while(j < pString.length())
			{
				System.out.print(pString.charAt(j));
				Thread.sleep(50);
				j++;
			}
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
				
				System.out.println("\n "
						+ "\n               o             o             o          ______   "
						+ "\n             _-|-__       __-|-__       __-|-__      |    o |  "
						+ "\n            |      |-----|       |-----|       |-----|      |_ "
						+ "\n____________|______|_____|_______|_____|_______|_____|________|_______________");
				
			}
		
			clip.stop();
			clip.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}

