package test;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.BottomupMergesort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.Quicksort;
import algorithms.SelectionSort;
import algorithms.ShellSort;

public class TestSort {
	Integer[] unsorted = {3,5,2,9,0,6,1,4,7,8};
	Integer[] expected ={0,1,2,3,4,5,6,7,8,9};
	int[] unsortedInt = {3,5,2,9,0,6,1,4,7,8};
	int[] expectedInt ={0,1,2,3,4,5,6,7,8,9};
	String firstString ="always fails";
	
	
	@Test
	public void test() {
		SelectionSort ss = new SelectionSort();
		//fail("Not yet implemented");
		
		//ss.setIntSort(unsorted);
		ss.sort(unsorted);
		assertArrayEquals(expected,ss.getSorted());
	}
	
	@Test
	public void testInt() {
		SelectionSort ss = new SelectionSort();
		//fail("Not yet implemented");
		ss.setSort(unsortedInt);
		ss.sort(unsortedInt);
		assertArrayEquals(expectedInt,ss.getInt());
	}
	@Test
	public void testInsertionSort(){
		//fail("always fails");
		InsertionSort is = new InsertionSort();
		is.setSort(unsortedInt);
		is.sort(unsortedInt);
		assertArrayEquals(expectedInt,is.getInt());
	}
	
	@Test
	public void testShellShort(){
		//fail(firstString);
		ShellSort shellsort = new ShellSort();
		shellsort.setSort(unsortedInt);
		shellsort.sort(unsortedInt);
		assertArrayEquals(expectedInt,shellsort.getInt());
	}
	
	@Test
	public void testMergesort(){
		//fail(firstString);
		MergeSort ms = new MergeSort();
		ms.setSort(unsortedInt);
		ms.sort(unsortedInt);
		assertArrayEquals(expectedInt,ms.getInt());
	}
	
	@Test
	public void testBottomupMergesort(){
		BottomupMergesort bm = new BottomupMergesort(); 
		bm.setSort(unsortedInt);
		bm.sort(unsortedInt);
		assertArrayEquals(expectedInt,bm.getInt());
	}
	
	@Test
	public void testQuickSort(){
		Quicksort qs = new Quicksort();
		qs.setSort(unsortedInt);
		qs.sort(unsortedInt);
		assertArrayEquals(expectedInt,qs.getInt());
	}
}
