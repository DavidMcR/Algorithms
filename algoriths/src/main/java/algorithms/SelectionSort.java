package algorithms;

import java.awt.List;
import java.util.Comparator;

public class SelectionSort {
	public SelectionSort(){
		
	}
	
	public static Integer[] intSort = new Integer[10];
	//public List<Integer> sortingList = new List<Integer>();
	private static int[] select;
	
	public void setSort(int[] x){
		select = new int[x.length];
		for(int i=0;i<x.length;i++)select[i]=x[i];
	}
	
	public Integer[] getSorted() {
		
		return intSort;
	}
	public int[] getInt(){
		return select;
	}
	//************************************************
	//***********depricated***************************
	//************************************************
	public void setIntSort(int[] a){
		int length=a.length;
		for(int i=0;i<length;i++)
			intSort[i]=a[i];
		
	}
	
	public static void sort(int[] alpha)
	
	{
		int n = alpha.length;
		for (int i=0;i<n;i++){
			int min=i;
			for (int j=i+1;j<n;j++){				
			if(less(alpha[j],alpha[min])){min=j;			
				}
			}
			exchange(alpha,i,min);
			//assert isSorted(alpha, 0, i);
			select[i]=alpha[i];
		}		
		//assert isSorted(alpha);
	}
	public static void sort(Integer[] alpha)
		
	{
		int n = alpha.length;
		for (int i=0;i<n;i++){		
			int min=i;
			for (int j=i+1;j<n;j++){				
			if(less(alpha[j],alpha[min])){min=j;			
				}
			}
			exchange(alpha,i,min);
			assert isSorted(alpha, 0, i);
			intSort[i]=alpha[i];
		}		
		assert isSorted(alpha);
	}
	
	
	public static void sort(Object[] object, Comparator comparator){
		int n = object.length;
		for (int i = 0; i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
			if(less(comparator, object[j],object[min]))min=j;
			}
			exchange(object,i,min);
		}
			
		
	}
	

	private static boolean less(Integer Integer, Integer Integer2) {

		return (Integer.compareTo(Integer2)<0);
	}
	private static boolean less(Comparator comparator , Object object1, Object object2) {

		return (comparator.compare(object1, object2)<0);
	}
	private static void exchange(Object[] object, int alpha, int beta ){
		Object swap = object[alpha];
		object[alpha]=object[beta];
		object[beta]=swap;
	}
	private static void exchange(int[] toExchange, int alpha, int beta ){
		int swap = toExchange[alpha];
		toExchange[alpha]=toExchange[beta];
		toExchange[beta]=swap;
	}
	 private static boolean isSorted(Integer[] a) {
	        return isSorted(a, 0, a.length - 1);
	    }
	 
	   private static boolean isSorted(Integer[] a, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }

}
