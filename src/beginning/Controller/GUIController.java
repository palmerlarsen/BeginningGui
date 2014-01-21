package beginning.Controller;

import beginning.View.GUIFrame;

public class GUIController
{
	private GUIFrame appFrame;
	
	public GUIController()
	{
		
	}
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
