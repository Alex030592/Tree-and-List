package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Task.AList0;
import Task.AList1;
import Task.AList2;
import Task.EList;
import Task.LList1;
import Task.LList2;

public class EListTest_NG
{
	@DataProvider
	public Object[][] parameterTest() {
		return new Object[][]{
			{ new AList0() }, 
			{ new AList1() }, 
			{ new AList2() },
			{ new LList1() },
			{ new LList2() }
		};
	}

	//========================================================
	//init
	//========================================================

	@Test(dataProvider = "parameterTest")
	public void test_init_null(EList obj) 
	{
		int[] rr=null;
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	
	@Test(dataProvider = "parameterTest")
	public void test_init_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_init_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_init_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_init_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_clear_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_clear_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_clear_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.clear();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_clear_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_toArray_null(EList obj) 
	{
		int[] rr=null;
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toArray_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toArray_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toArray_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={5,-5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toArray_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_toString_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		String act=obj.toString();
		String exp="";
		assertEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toString_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		String act=obj.toString();
		String exp="5";
		assertEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toString_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		String act=obj.toString();
		String exp="5,-5";
		assertEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_toString_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_size_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		int res=obj.size();
		assertEquals(0,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_size_1(EList obj) 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.size();
		assertEquals(1,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_size_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.size();
		assertEquals(2,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_size_many(EList obj) 
	{
		int[] rr={-5,0,51,-64,1000};
		obj.init(rr);
		int res=obj.size();
		assertEquals(5,res);
	}

	//========================================================
	//addStart
	//========================================================

	@Test(dataProvider = "parameterTest")
	public void test_addStart_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addStart_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5,1};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addStart_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addStart(5);
		int[] act=obj.toArray();
		int[] exp={5,1,-5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addStart_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_addEnd_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addEnd_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={1,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addEnd_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addEnd(5);
		int[] act=obj.toArray();
		int[] exp={1,-5,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addEnd_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_addPos_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.addPos(0,5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addPos_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		obj.addPos(1,5);
		int[] act=obj.toArray();
		int[] exp={1,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addPos_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.addPos(1,5);
		int[] act=obj.toArray();
		int[] exp={1,5,-5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_addPos_many(EList obj) 
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

	@Test(expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_delStart_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.delStart();
	}
	@Test(dataProvider = "parameterTest")
	public void test_delStart_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delStart();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delStart_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delStart();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={-5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delStart_many(EList obj) 
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

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_delEnd_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.delEnd();
	}
	@Test(dataProvider = "parameterTest")
	public void test_delEnd_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delEnd();
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delEnd_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delEnd();
		assertEquals(-5,res);
		int[] act=obj.toArray();
		int[] exp={1};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delEnd_many(EList obj) 
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

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_delPos_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.delPos(0);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delPos_1(EList obj) 
	{
		int[] rr={1};
		obj.init(rr);
		int res=obj.delPos(0);
		assertEquals(1,res);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delPos_2(EList obj) 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.delPos(1);
		assertEquals(-5,res);
		int[] act=obj.toArray();
		int[] exp={1};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_delPos_many(EList obj) 
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

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_min_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.min();
	}
	@Test(dataProvider = "parameterTest")
	public void test_min_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.min();
		assertEquals(100,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_min_2(EList obj) 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.min();
		assertEquals(-500,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_min_many(EList obj) 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.min();
		assertEquals(-3,res);
	}

	//========================================================
	//max
	//========================================================

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_max_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.max();
	}
	@Test(dataProvider = "parameterTest")
	public void test_max_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.max();
		assertEquals(100,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_max_2(EList obj) 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.max();
		assertEquals(100,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_max_many(EList obj) 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.max();
		assertEquals(514,res);
	}

	//========================================================
	//minPos
	//========================================================

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_minPos_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.minPos();
	}
	@Test(dataProvider = "parameterTest")
	public void test_minPos_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(0,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_minPos_2(EList obj) 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(1,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_minPos_many(EList obj) 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.minPos();
		assertEquals(2,res);
	}

	//========================================================
	//maxPos
	//========================================================

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_maxPos_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.maxPos();
	}
	@Test(dataProvider = "parameterTest")
	public void test_maxPos_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(0,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_maxPos_2(EList obj) 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(0,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_maxPos_many(EList obj) 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.maxPos();
		assertEquals(3,res);
	}

	//========================================================
	//sort
	//========================================================

	@Test(dataProvider = "parameterTest")
	public void test_sort_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_sort_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_sort_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.sort();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_sort_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_reverse_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_reverse_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_reverse_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_reverse_many(EList obj) 
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

	@Test(dataProvider = "parameterTest")
	public void test_halfreverse_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_halfreverse_1(EList obj) 
	{
		int[] rr={5};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_halfreverse_2(EList obj) 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.halfreverse();
		int[] act=obj.toArray();
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_halfreverse_many(EList obj) 
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

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_get_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.get(5);
	}
	@Test(dataProvider = "parameterTest")
	public void test_get_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		int res=obj.get(0);
		assertEquals(100,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_get_2(EList obj) 
	{
		int[] rr={100,-500};
		obj.init(rr);
		int res=obj.get(1);
		assertEquals(-500,res);
	}
	@Test(dataProvider = "parameterTest")
	public void test_get_many(EList obj) 
	{
		int[] rr={100,0,-3,514,-1};
		obj.init(rr);
		int res=obj.get(4);
		assertEquals(-1,res);
	}

	//========================================================
	//set
	//========================================================

	@Test (expectedExceptions =IllegalArgumentException.class, dataProvider = "parameterTest")
	public void test_set_0(EList obj) 
	{
		int[] rr={};
		obj.init(rr);
		obj.set(5,1);
	}
	@Test(dataProvider = "parameterTest")
	public void test_set_1(EList obj) 
	{
		int[] rr={100};
		obj.init(rr);
		obj.set(0,5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_set_2(EList obj) 
	{
		int[] rr={100,-5};
		obj.init(rr);
		obj.set(1,5);
		int[] act=obj.toArray();
		int[] exp={100,5};
		assertArrayEquals(exp,act);
	}
	@Test(dataProvider = "parameterTest")
	public void test_set_many(EList obj) 
	{
		int[] rr={100,0,25,-64,-2};
		obj.init(rr);
		obj.set(3,5);
		int[] act=obj.toArray();
		int[] exp={100,0,25,5,-2};
		assertArrayEquals(exp,act);
	}
}
