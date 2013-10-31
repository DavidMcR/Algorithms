package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomArray {
	
	public int[] intArray;
	public List<Integer> intList = new ArrayList<Integer>();
	
	public GenerateRandomArray(){}
	
	public GenerateRandomArray(int x){
		Random random = new Random();
		for (int i =0;i<x;i++){
			int r = random.nextInt(50);
			intList.add(r);

		}
		
	}
	
	public void Generate(){
		Random random = new Random();
		for (int i =0;i<intArray.length;i++){
			int r = random.nextInt(intArray.length);
			intArray[i]=r;

		}
	}

	public List<Integer> getIntList() {
		return intList;
	}
	
	public void setIntArray(int[] a){
		intArray = new int[a.length];
		for(int i = 0;i<a.length;i++)intArray[i]=a[i];
	}
	
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	
	public int[] getIntArray(){
		return intArray;
	}



}
