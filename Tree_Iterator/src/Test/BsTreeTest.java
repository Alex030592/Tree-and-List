package Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Task.BsTree;

public class BsTreeTest 
{
	BsTree obj = new BsTree();

	@Before
	public void clear_obj()
	{
		obj.clear();
	}

	//========================================================
	//add
	//========================================================

	@Test
	public void test_add_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.add(5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_add_1() 
	{
		int[] rr={1};
		obj.init(rr);
		obj.add(5);
		int[] act=obj.toArray();
		int[] exp={1,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_add_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		obj.add(5);
		int[] act=obj.toArray();
		int[] exp={-5,1,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_add_many() 
	{
		int[] rr={4,0,-5,100,-3};
		obj.init(rr);
		obj.add(5);
		int[] act=obj.toArray();
		int[] exp={-5,-3,0,4,5,100};
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
		int[] exp={-5,5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_init_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		int[] act=obj.toArray();
		int[] exp={-65, -10, 0, 5, 95};
		assertArrayEquals(exp,act);
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
	//leaves
	//========================================================

	@Test
	public void test_leaves_0() 
	{
		int[] rr={};
		obj.init(rr);
		int res=obj.leaves();
		assertEquals(0,res);
	}
	@Test
	public void test_leaves_1() 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.leaves();
		assertEquals(0,res);
	}
	@Test
	public void test_leaves_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.leaves();
		assertEquals(1,res);
	}
	@Test
	public void test_leaves_many() 
	{
		int[] rr={-5,0,51,-64,1000};
		obj.init(rr);
		int res=obj.leaves();
		assertEquals(2,res);
	}

	//========================================================
	//nodes
	//========================================================

	@Test
	public void test_nodes_0() 
	{
		int[] rr={};
		obj.init(rr);
		int res=obj.nodes();
		assertEquals(0,res);
	}
	@Test
	public void test_nodes_1() 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.nodes();
		assertEquals(0,res);
	}
	@Test
	public void test_nodes_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.nodes();
		assertEquals(1,res);
	}
	@Test
	public void test_nodes_many() 
	{
		int[] rr={-5,0,51,-64,1000};
		obj.init(rr);
		int res=obj.nodes();
		assertEquals(3,res);
	}

	//========================================================
	//height
	//========================================================

	@Test
	public void test_height_0() 
	{
		int[] rr={};
		obj.init(rr);
		int res=obj.height();
		assertEquals(0,res);
	}
	@Test
	public void test_height_1() 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.height();
		assertEquals(1,res);
	}
	@Test
	public void test_height_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.height();
		assertEquals(2,res);
	}
	@Test
	public void test_height_many() 
	{
		int[] rr={33,-10,0,95,-65,100,32,-6,4,65,5};
		obj.init(rr);
		int res=obj.height();
		assertEquals(6,res);
	}

	//========================================================
	//width
	//========================================================

	@Test (expected=IllegalArgumentException.class)
	public void test_width_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.width();
	}
	@Test
	public void test_width_1() 
	{
		int[] rr={10};
		obj.init(rr);
		int res=obj.width();
		assertEquals(1,res);
	}
	@Test
	public void test_width_2() 
	{
		int[] rr={1,-5};
		obj.init(rr);
		int res=obj.width();
		assertEquals(1,res);
	}
	@Test
	public void test_width_many() 
	{
		int[] rr={-5,0,51,-64,1000};
		obj.init(rr);
		int res=obj.width();
		assertEquals(2,res);
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
		int[] exp={5,-5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_reverse_many() 
	{
		int[] rr={33,-10,0,95,-65,100,32,-6,4,65,5};
		obj.init(rr);
		obj.reverse();
		int[] act=obj.toArray();
		int[] exp={100,95,65,33,32,5,4,0,-6,-10,-65};
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
		obj.toString();
		String act=obj.toString();
		String exp="5";
		assertEquals(exp,act);
	}
	@Test
	public void test_toString_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.toString();
		String act=obj.toString();
		String exp="-5,5";
		assertEquals(exp,act);
	}
	@Test
	public void test_toString_many() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.toString();
		String act=obj.toString();
		String exp="-65,-10,0,5,95";
		assertEquals(exp,act);
	}
	
	//========================================================
	//del
	//========================================================

	@Test 
	public void test_del_0() 
	{
		int[] rr={};
		obj.init(rr);
		obj.del(1);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_del_1() 
	{
		int[] rr={5};
		obj.init(rr);
		obj.del(5);
		int[] act=obj.toArray();
		int[] exp={};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_del_2() 
	{
		int[] rr={5,-5};
		obj.init(rr);
		obj.del(-5);
		int[] act=obj.toArray();
		int[] exp={5};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_del_many1() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.del(-65);
		int[] act=obj.toArray();
		int[] exp={-10, 0,5,95};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_del_many2() 
	{
		int[] rr={5,-10,0,95,-65,100};
		obj.init(rr);
		obj.del(95);
		int[] act=obj.toArray();
		int[] exp={-65,-10, 0,5,100};
		assertArrayEquals(exp,act);
	}
	@Test
	public void test_del_many3() 
	{
		int[] rr={5,-10,0,95,-65};
		obj.init(rr);
		obj.del(-10);
		int[] act=obj.toArray();
		int[] exp={-65,0,5,95};
		assertArrayEquals(exp,act);
	}
}
