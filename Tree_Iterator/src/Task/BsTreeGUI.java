package Task;

import java.awt.Graphics2D;

public class BsTreeGUI extends BsTree
{
	public void printGUI(Graphics2D gg, int right )
	{
		printNodeGUI(root, gg, 0, right, 1, 50, right/2, 20);
	}

	private void printNodeGUI(Node p, Graphics2D gg, int left, int right, int level, int dy, int x2, int y2) 
	{
		if(p==null)
		{
			return;
		}
		
		int x1 = (left + right)/2;
		int y1 = dy * level;
		
		gg.drawString("" + p.val, x1+7, y1+20);
		gg.drawOval(x1, y1, 30, 30);
		gg.drawLine(x1+15, y1, x2+15, y2+30);
		printNodeGUI(p.left,  gg, left, x1,  level +1, dy,x1, y1);
		printNodeGUI(p.right, gg, x1, right, level +1, dy,x1, y1);
		
	}
}
