package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Task.BsTree;

public class IteratorTest 
{
	BsTree obj = new BsTree();

	public int[] Test_Iterator(int[] ini)
	{
		obj.init(ini);
		int[] mas = new int [obj.size()];
		int j = 0;
		for (Integer i : obj) 
		{
			mas[j] = i;
			j++;
		}
		return mas;
	}
	@Test
	public void test_init_0() 
	{ 
		int[] rr={};
		int[] act=Test_Iterator(rr);
		int[] exp=rr;
		assertArrayEquals(exp,act);
	} 

	@Test
	public void test_init_1() 
	{ 
		int[] rr={11};
		int[] act=Test_Iterator(rr);
		int[] exp=rr;
		assertArrayEquals(exp,act);
	} 

	@Test
	public void test_init_2() 
	{ 
		int[] rr={11,12};
		int[] act=Test_Iterator(rr);
		int[] exp=rr;
		assertArrayEquals(exp,act);
	} 

	@Test
	public void test_init_many() 
	{ 
		int[] rr={0,-5,5,-7,7,-3,3};
		int[] act=Test_Iterator(rr);
		int[] exp={0, -5, -7, -3, 5, 3, 7};
		assertArrayEquals(exp,act);
	} 
}
