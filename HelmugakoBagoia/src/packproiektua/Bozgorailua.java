package packproiektua;

import java.io.File;

import javax.sound.sampled.*;

public class Bozgorailua {
	
	private static Clip clip;
	private static Bozgorailua nireBozgorailua = null;
	
	private Bozgorailua() 
	{
		try
		{
			String filePath = "./src/sounds/backgroundMusic.wav";
			File audioFile = new File(filePath);
			clip = AudioSystem.getClip();
			
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip.open(inputStream);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Bozgorailua getBozgorailua()
	{
		if(nireBozgorailua == null)
		{
			nireBozgorailua = new Bozgorailua();
		}
		return nireBozgorailua;
	}
	
	protected void backMusicHasi()
	{
		try
		{	
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void backMusicPausatu()
	{
		try {
			clip.stop();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected void backMusicItzali()
	{
		try {
			clip.stop();
			clip.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
