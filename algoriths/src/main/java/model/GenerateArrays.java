package model;

import java.util.Random;


import algorithms.BottomupMergesort;
import algorithms.ConcreteSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.SelectionSort;
import algorithms.ShellSort;
import algorithms.SortInterface;

public class GenerateArrays {	
	
	public Long time;
	public int size;
	public Long averageTime=(long) 0;
	public int averageSize;
	public SortInterface si;

	public GenerateArrays(){
		
	}
	public void Generate(){
		
		//*****************************************************************
		for (int i = 0;i<50;i++){
		GenerateRandomArray gra = new GenerateRandomArray();
		Random random = new Random();
		int arrayLength=random.nextInt(10000);
		int[] a = new int[arrayLength];
		gra.setIntArray(a);
		gra.Generate();
		int[] unsorted = gra.getIntArray();
		//*****************************************************************
		

		int [] sorted = new int[unsorted.length];
		System.arraycopy(unsorted, 0, sorted, 0, unsorted.length);
		Long startTime=System.currentTimeMillis();
		ConcreteSort cs = new ConcreteSort(/*new InsertionSort()*/si,sorted);
		Long endTime=System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		Long totalTime=endTime-startTime;
		System.out.println(totalTime);	
		time=totalTime;
		size=unsorted.length;
		averageSize=averageSize+size;
		averageTime=averageTime+time;
		}
		averageTime= averageTime/50;
		averageSize=averageSize/50;
		System.out.println("average time "+averageTime+"   "+"average size of the array: "+averageSize);
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Long getAverageTime() {
		return averageTime;
	}
	public void setAverageTime(Long averageTime) {
		this.averageTime = averageTime;
	}
	public int getAverageSize() {
		return averageSize;
	}
	public void setAverageSize(int averageSize) {
		this.averageSize = averageSize;
	}
	
	public void setInsertionSort(String sort){
		switch (sort){
		case "Insertion Sort": si = new InsertionSort();
		case "Shell Sort": si = new ShellSort();
		case "Selection Sort": si= new  SelectionSort();
		case "Merge Sort":si= new MergeSort();
		case "Bottumup Merge Sort":si= new BottomupMergesort();
		}

	}
	
	public SortInterface getInsertionSort(){
		return si;
	}


}
