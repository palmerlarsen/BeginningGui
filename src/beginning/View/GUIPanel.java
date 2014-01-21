package beginning.View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import beginning.Controller.GUIController;

public class GUIPanel extends JPanel
{

	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("my first Button");
		secondButton = new JButton("my second Button");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 6, SpringLayout.EAST, firstButton);
		
	}
	
	private void setupPanel()
	{
		 this.setLayout(baseLayout);
		 this.add(firstButton);
		 this.add(secondButton);
	}
}
