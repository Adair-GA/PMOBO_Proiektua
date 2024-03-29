package packproiektua;

import java.util.ArrayList;

public class JokalariZerrenda {
	
	private ArrayList<Jokalaria>lista;
	private static JokalariZerrenda nireJokalariZerrenda = null;
	
	private JokalariZerrenda()
	{
		this.lista = new ArrayList<Jokalaria>();
	}
	
	public static JokalariZerrenda getJokalariZerrenda()
	{
		if (nireJokalariZerrenda == null)
		{
			nireJokalariZerrenda = new JokalariZerrenda();
		}
		return nireJokalariZerrenda;
	}
	
	public Jokalaria jokalariaSortu()
	{
		Jokalaria jk;
		jk = new Jokalaria()
	}
	
}
