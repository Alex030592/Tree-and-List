package Task;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TPanel extends JPanel 
{
	public TPanel() 
	{
		setLayout(null);
		JButton btn = new JButton("Print BsTree");
		btn.setBounds(10, 10, 100, 20);
		add(btn);
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e) 
			{
				int[] ini = {60, 76, 52, 71, 89, 23, 15, 40, 90, 13, 99, 70, 75, 88, 41,67,65, 63, 72, 43};
				BsTreeGUI tree = new BsTreeGUI();
				tree.init(ini);
				tree.printGUI((Graphics2D) getGraphics(), getWidth());
			}
		});
	}
}	
