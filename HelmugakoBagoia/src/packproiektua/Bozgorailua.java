package packproiektua;

import javax.sound.sampled.*;

public class Bozgorailua {
	
	private static Clip clip;
	private static Bozgorailua nireBozgorailua = null;
	
	private Bozgorailua() 
	{
		try
		{
			String filePath = File.separator+"sounds"+File.separator+"backgroundMusic.wav";
			clip = AudioSystem.getClip();
			
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResource(filePath));
			
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
	
	public void backMusicHasi()
	{
		try
		{	
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void backMusicPausatu()
	{
		try {
			clip.stop();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void backMusicItzali()
	{
		try {
			clip.stop();
			clip.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
