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
public class EListTestPrm
{
	EList obj = null;

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

	public EListTestPrm(EList prm) 
	{
		obj = prm;
	}
	
	@Before
	public void clear_obj()
	{
		obj.clear();
	}

	//========================================================
	//init
	//========================================================

	@Test
	public void test_init_null() 
	{
		int[] rr=null;
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_init_0() 
	{
		int[] rr={};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_init_1() 
	{
		int[] rr={5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_init_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_init_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-10,0,95,-65};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//clear
	//========================================================

	@Test
	public void test_clear_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_clear_1() 
	{
		int[] rr={5};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_clear_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_clear_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//toArray
	//========================================================

	@Test
	public void test_toArray_null() 
	{
		int[] rr=null;
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_toArray_0() 
	{
		int[] rr={};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_toArray_1() 
	{
		int[] rr={5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_toArray_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_toArray_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-10,0,95,-65};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//toString
	//========================================================
	
	@Test
	public void test_toString_0() 
	{
		int[] rr={};
		obj.init(rr);
		String act=obj.toString();
		String exp="";
		assertEquals(exp,act);
	}
	@Test
	public void test_toString_1() 
	{
		int[] rr={5};
		obj.init(rr);
		String act=obj.toString();
		String exp="5";
		assertEquals(exp,act);
	}
	@Test
	public void test_toString_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		String act=obj.toString();
		String exp="5,-5";
		assertEquals(exp,act);
	}
	@Test
	public void test_toString_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		String act=obj.toString();
		String exp="5,-10,0,95,-65";
		assertEquals(exp,act);
	}
	
	//========================================================
	//size
	//========================================================

	@Test
	public void test_size_0() 
	{
		int[] rr={};
		obj.init(rr);
		int res=obj.size();
		assertEquals(0,res);
	}
	@Test
	public void test_size_1() 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.size();
		assertEquals(1,res);
	}
	@Test
	public void test_size_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.size();
		assertEquals(2,res);
	}
	@Test
	public void test_size_many() 
	{
		int[] rr={-5,0,51,-64,1000};
		obj.init(rr);
		int res=obj.size();
		assertEquals(5,res);
	}

	//========================================================
	//addStart
	//========================================================

	@Test
	public void test_addStart_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addStart_1() 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5,1};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addStart_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5,1,-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addStart_many() 
	{
		int[] rr={4,0,-5,100,-3};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5,4,0,-5,100,-3};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//addEnd
	//========================================================

	@Test
	public void test_addEnd_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addEnd_1() 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={1,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addEnd_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={1,-5,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addEnd_many() 
	{
		int[] rr={4,0,-5,100,-3};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={4,0,-5,100,-3,5};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//addPos
	//========================================================

	@Test
	public void test_addPos_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.addPos(0,5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addPos_1() 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addPos(1,5);
		int[] act=obj.toArray();
		int[] exp={1,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addPos_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addPos(1,5);
		int[] act=obj.toArray();
		int[] exp={1,5,-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_addPos_many() 
	{
		int[] rr={4,0,-5,100,-3};
		obj.init(rr);
		obj.addPos(3,5);
		int[] act=obj.toArray();
		int[] exp={4,0,-5,5,100,-3};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//delStart
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_delStart_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.delStart();
	}
	@Test
	public void test_delStart_1() 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delStart();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delStart_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delStart();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delStart_many() 
	{
		int[] rr={5,-10,0,65,-95};
		obj.init(rr);
		int res=obj.delStart();
		assertEquals(5,res);
		int[] act=obj.toArray();
		int[] exp={-10,0,65,-95};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//delEnd
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_delEnd_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.delEnd();
	}
	@Test
	public void test_delEnd_1() 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delEnd();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delEnd_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delEnd();
		assertEquals(-5,res);
		int[] act=obj.toArray();
		int[] exp={1};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delEnd_many() 
	{
		int[] rr={5,-10,0,65,-95};
		obj.init(rr);
		int res=obj.delEnd();
		assertEquals(-95,res);
		int[] act=obj.toArray();
		int[] exp={5,-10,0,65};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//delPos
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_delPos_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.delPos(0);
	}
	@Test
	public void test_delPos_1() 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delPos(0);
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delPos_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delPos(1);
		assertEquals(-5,res);
		int[] act=obj.toArray();
		int[] exp={1};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_delPos_many() 
	{
		int[] rr={5,-10,0,65,-95};
		obj.init(rr);
		int res=obj.delPos(3);
		assertEquals(65,res);
		int[] act=obj.toArray();
		int[] exp={5,-10,0,-95};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//min
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_min_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.min();
	}
	@Test
	public void test_min_1() 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.min();
		assertEquals(100,res);
	}
	@Test
	public void test_min_2() 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.min();
		assertEquals(-500,res);
	}
	@Test
	public void test_min_many() 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.min();
		assertEquals(-3,res);
	}

	//========================================================
	//max
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_max_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.max();
	}
	@Test
	public void test_max_1() 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.max();
		assertEquals(100,res);
	}
	@Test
	public void test_max_2() 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.max();
		assertEquals(100,res);
	}
	@Test
	public void test_max_many() 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.max();
		assertEquals(514,res);
	}

	//========================================================
	//minPos
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_minPos_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.minPos();
	}
	@Test
	public void test_minPos_1() 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(0,res);
	}
	@Test
	public void test_minPos_2() 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(1,res);
	}
	@Test
	public void test_minPos_many() 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(2,res);
	}

	//========================================================
	//maxPos
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_maxPos_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.maxPos();
	}
	@Test
	public void test_maxPos_1() 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(0,res);
	}
	@Test
	public void test_maxPos_2() 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(0,res);
	}
	@Test
	public void test_maxPos_many() 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(3,res);
	}

	//========================================================
	//sort
	//========================================================

	@Test
	public void test_sort_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_sort_1() 
	{
		int[] rr={5};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_sort_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_sort_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={-65,-10,0,5,95};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//reverse
	//========================================================

	@Test
	public void test_reverse_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_reverse_1() 
	{
		int[] rr={5};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_reverse_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_reverse_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={-65,95,0,-10,5};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//halfreverse
	//========================================================

	@Test
	public void test_halfreverse_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_halfreverse_1() 
	{
		int[] rr={5};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_halfreverse_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_halfreverse_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={95,-65,0,5,-10};
		assertArrayEquals(exp,act);
	}

	//========================================================
	//get
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_get_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.get(5);
	}
	@Test
	public void test_get_1() 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.get(0);
		assertEquals(100,res);
	}
	@Test
	public void test_get_2() 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.get(1);
		assertEquals(-500,res);
	}
	@Test
	public void test_get_many() 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.get(4);
		assertEquals(-1,res);
	}

	//========================================================
	//set
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_set_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.set(5,1);
	}
	@Test
	public void test_set_1() 
	{
		int[] rr={100};
		obj.init(rr);
		obj.set(0,5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_set_2() 
	{
		int[] rr={100,-5};
		obj.init(rr);
		obj.set(1,5);
		int[] act=obj.toArray();
		int[] exp={100,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_set_many() 
	{
		int[] rr={100,0,25,-64,-2};
		obj.init(rr);
		obj.set(3,5);
		int[] act=obj.toArray();
		int[] exp={100,0,25,5,-2};
		assertArrayEquals(exp,act);
	}
}