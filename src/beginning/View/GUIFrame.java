package beginning.View;

import javax.swing.JFrame;

import beginning.Controller.GUIController;

/**
 * Framework or  GUI Frame class.
 * @author plar4927
 *version 1.3 10/22/12
 */

public class GUIFrame extends JFrame
{

	/**
	 * the controller object that will be shared across the application.
	 */
	private GUIController baseController;
	/**
	 * the main panel for the application
	 */
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	/**
	 * Helper method to setup the default size and panel for the Frame
	 */
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
