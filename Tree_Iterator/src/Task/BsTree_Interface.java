package Task;

public interface BsTree_Interface 
{
	public void add(int val);
	public void clear();
	public void init(int[] ini);
	public int size();
	public int leaves();
	public int nodes();
	public int height();
	public int width();
	public void reverse();
	public String toString();
	public int[] toArray();
	public void del(int key);
}
