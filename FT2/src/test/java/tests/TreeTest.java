package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tree.HierRelation;
import tree.Tree;

public class TreeTest {
	
	@Test
	public void testTree()
	{
		List<HierRelation> hrList = new ArrayList<HierRelation>();
		
		HierRelation r = new HierRelation(0L, 0L);
		hrList.add(r);
		
		r = new HierRelation(0L, 1L);
		hrList.add(r);
		
		r = new HierRelation(0L, 2L);
		hrList.add(r);
		
		r = new HierRelation(1L, 3L);
		hrList.add(r);
		
		r = new HierRelation(1L, 4L);
		hrList.add(r);
		
		r = new HierRelation(3L, 5L);
		hrList.add(r);
		
		Tree t = new Tree(hrList);
		
	}

}
