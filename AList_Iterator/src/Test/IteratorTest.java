package Test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import Task.AList0;
import Task.AList1;
import Task.AList2;
import Task.EList;
import Task.LList1;
import Task.LList2;

@RunWith(Parameterized.class)
public class IteratorTest 
{
	static EList obj = null;

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][] 
				{     
			{ new AList0() }, 
			{ new AList1() }, 
			{ new AList2() },
			{ new LList1() },
			{ new LList2() }
				});
	}

	public IteratorTest(EList prm) 
	{
		obj = prm;
	}
	
	public static int[] Test_Iterator(int[] ini)
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

	@Before
	public void clear_obj()
	{
		obj.clear();
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
		int[] rr={11,12,13,14,15,16,17,18,19};
		int[] act=Test_Iterator(rr);
		int[] exp=rr;
		assertArrayEquals(exp,act);
	} 
}
