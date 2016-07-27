package Task;

import java.util.Iterator;

public class BsTree implements BsTree_Interface,Iterable<Integer>
{
	class Node
	{
		int val;
		Node left;
		Node right;
		Node parent;
		public Node(int val)
		{
			this.val=val;
		}
	}
	protected Node root=null;

	//========================================================
	//add
	//========================================================
	
	@Override
	public void add(int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return;
		}
		addNode(root, val);
	}

	private void addNode(Node p, int val) 
	{
		if(val<p.val)
		{
			if(p.left==null)
			{
				p.left=new Node(val);
				p.left.parent = p;
			}
			else
			{
				addNode(p.left,val);
			}
		}
		else
		{
			if(p.right==null)
			{
				p.right=new Node(val);
				p.right.parent = p;
			}
			else
			{
				addNode(p.right,val);
			}
		}
	}

	//========================================================
	//clear
	//========================================================

	@Override
	public void clear()
	{
		root=null;
	}

	//========================================================
	//init
	//========================================================

	public void init(int[] ini)
	{
		if(ini==null)
		{
			ini = new int[0];
		}
		for(int i=0;i<ini.length;i++)
		{
			add(ini[i]);
		}
	}

	//========================================================
	//size
	//========================================================

	@Override
	public int size()
	{
		return sizeNode(root);
	}

	private int sizeNode(Node p)
	{
		if(p==null)
		{
			return 0;
		}

		return sizeNode(p.left)+1+sizeNode(p.right);
	}

	//========================================================
	//leaves
	//========================================================

	@Override
	public int leaves()
	{
		return LeavesNode(root);
	}

	private int LeavesNode(Node p)
	{
		if(p == null)
		{
			return 0;
		}
		int count = 0;
		count += LeavesNode(p.left);
		if(p.left==null && p.right==null)
		{
			if(p!=root)
			{
				count++;
			}
		}
		count += LeavesNode(p.right);
		return count;
	}

	//========================================================
	//nodes
	//========================================================

	@Override
	public int nodes()
	{
		return nodesNode(root);
	}

	private int nodesNode(Node p)
	{
		if(p == null)
		{
			return 0;
		}

		int count = 0;
		count += nodesNode(p.left);
		if(p.left!=null || p.right!=null)
		{
			count++;
		}
		count += nodesNode(p.right);
		return count;
	}

	//========================================================
	//height
	//========================================================

	@Override
	public int height()
	{
		return heightNode(root);
	}

	private int heightNode(Node p)
	{
		if(p == null)
		{
			return 0;
		}

		return 1 + Math.max(heightNode(p.left), heightNode(p.right));
	}

	//========================================================
	//width
	//========================================================

	@Override
	public int width()
	{
		int[] ar= new int[height()];
		widthNode(root, ar, 0);
		return max(ar);
	}

	private void widthNode(Node p, int[] ar, int level) 
	{
		if (p == null)
		{
			return;
		}

		widthNode(p.left, ar, level +1);
		ar[level]++;
		widthNode(p.right, ar, level +1);
	}

	private int max(int[] ar)
	{
		if(ar.length == 0)
		{
			throw new IllegalArgumentException();
		}

		int max=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}	
		}
		return max;
	}


	//========================================================
	//reverse
	//========================================================

	@Override
	public void reverse()
	{
		reverseNode(root);
	}

	private void reverseNode(Node p)
	{
		if(p == null)
		{
			return;
		}

		reverseNode(p.left);
		reverseNode(p.right);
		Node temporary = p.left;
		p.left = p.right;
		p.right = temporary;
	}

	//========================================================
	//toString
	//========================================================

	@Override
	public String toString()
	{
		String rez = toStringNode(root);
		if(rez.length()==0)
		{
			return rez;
		}
		return rez.substring(0,rez.length()-1);
	}

	private String toStringNode(Node p) 
	{
		if(p == null)
		{
			return "";
		}

		String rez = "";
		rez += toStringNode(p.left);
		rez += p.val+",";
		rez += toStringNode(p.right);
		return rez;
	}

	//========================================================
	//toArray
	//========================================================

	class Counter
	{
		int index = 0;
	}
	
	@Override
	public int[] toArray()
	{
		int[] rez = new int[size()];
		toArrayNode(root, rez, new Counter());
		return rez;
	}

	private void toArrayNode(Node p, int[] rez, Counter ii)
	{
		if(p == null)
		{
			return;
		}

		toArrayNode(p.left, rez, ii);
		rez[ii.index++] = p.val;
		toArrayNode(p.right, rez, ii);
		return;
	}

	//========================================================
	//del
	//========================================================

	@Override
	public void del(int key)
	{
		if(root==null)
		{
			return; 
		}
		Node p=root;
		Node parent=root;
		boolean isLeft=true;
		while(p.val!=key)
		{
			parent=p;
			if(key<p.val)
			{
				isLeft=true;
				p=p.left;
			}
			else
			{
				isLeft=false;
				p=p.right;
			}
			if(p==null)
			{
				return;
			}
		}
		if(p.left==null && p.right==null)
		{
			if(p==root)
			{
				root=null;
			}
			else if(isLeft)
			{
				parent.left=null;
			}
			else
			{
				parent.right=null;
			}
		}
		else if(p.left==null || p.right==null)
		{
			if(p.right==null)
			{
				if(p==root)
				{
					root=p.left;
				}
				else if(isLeft)
				{
					parent.left=p.left;
				}
				else
				{
					parent.right=p.left;
				}
			}
			else if(p.left==null)
			{
				if(p==root)
				{
					root=p.right;
				}
				else if(isLeft)
				{
					parent.left=p.right;
				}
				else
				{
					parent.right=p.right;
				}
			}
		}
		else 
		{
			Node successor = getSuccessor(p);
			if(p==root)
			{
				root=successor;
			}
			else if(isLeft)
			{
				parent.left=successor;
			}
			else 
			{
				parent.right=successor;
			}
			successor.left=p.left;
		}
	}

	private Node getSuccessor (Node delNode)
	{
		Node successorParent=delNode;
		Node successor=delNode;
		Node p=delNode.right;
		while(p!=null)
		{
			successorParent=successor;
			successor=p;
			p=p.left;
		}
		if(successor!=delNode.right)
		{
			successorParent.left=successor.right;
			successor.right=delNode.right;
		}
		return successor;
	}

	//Iterator-----------------------------------------------------------------------

	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(root);
	}

	class MyIter implements Iterator<Integer>
	{
		Node p;

		public MyIter(Node p) 
		{
			this.p = p;
		}

		@Override
		public boolean hasNext() 
		{
			return p != null;
		}

		@Override
		public Integer next() 
		{
			int ret;
			ret = p.val;

			if(p.left != null)
			{
				p = p.left;
			}
			else if(p.right != null)
			{
				p = p.right;
			}
			else
			{
				Node parent = p.parent;
				Node child = p;
				while (parent != null &&
						(parent.right == child || parent.right == null)) {
					child = parent;
					parent = parent.parent;
				}
				if (parent == null)
					p = null;
				else
					p = parent.right;
			}
			return ret;
		}
	}
}
