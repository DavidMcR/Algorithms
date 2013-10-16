package org.dmcrob01.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomArray {
	
	//public int[] intArray = new int[100];
	public List<Integer> intList = new ArrayList<Integer>();
	
	public GenerateRandomArray(int x){
		Random random = new Random();
		for (int i =0;i<x;i++){
			int r = random.nextInt(50);
			intList.add(r);

		}
	}

	public List<Integer> getIntList() {
		return intList;
	}

	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}



}
