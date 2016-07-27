package Task;

import javax.swing.JFrame;

public class TFrame extends JFrame 
{
	public TFrame()
	{
		setBounds(50, 50, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new TPanel());
		setVisible(true);
	}
}
