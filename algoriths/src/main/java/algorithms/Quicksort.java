package algorithms;
 
import edu.princeton.cs.introcs.*;

public class Quicksort { 
	public static int[] toSort;
	
	public void setSort(int[] unsortedInt) {
		// TODO Auto-generated method stub
		int n =unsortedInt.length;
		toSort = new int[n];
		for(int i = 0;i<n;i++)toSort[i]=unsortedInt[i];
	}
	

	public void sort(int[] unsortedInt){
		StdRandom.shuffle(unsortedInt);
		sort(unsortedInt,0,unsortedInt.length-1);
		for (int i=0;i<unsortedInt.length;i++)toSort[i]=unsortedInt[i];
	}
	
	public static void sort(int[] unsortedInt,int lo, int hi){
		if (hi<=lo) return;
		int j= partition(unsortedInt,lo,hi);
		sort(unsortedInt,lo,j-1);
		sort(unsortedInt,j+1,hi);
	}
	
	private static int partition(int[] unsortedInt, int lo, int hi){
		int i=lo;
		int j= hi+1;
		int v = unsortedInt[lo];
		while(true){
			while (less (unsortedInt[++i],v))
				if(i==hi) break;
			
			while((less(v,unsortedInt[--j])))
				if(j==lo) break;
			
			if (i>=j) break;
			
			exchange(unsortedInt,i,j);
		}
		
		exchange(unsortedInt,lo,j);
		
		return j;
		
	}
	
	public static int select(int[] unsortedInt, int k){
		if (k<0 || k>=unsortedInt.length){
			throw new IndexOutOfBoundsException("selected element out of bounds");}
		StdRandom.shuffle(unsortedInt);
		int lo=0, hi = unsortedInt.length-1;
		while (hi>lo){
			int i = partition(unsortedInt,lo,hi);
			if (i>k) hi=i-1;
			else if (i<k)lo=i+1;
			else return unsortedInt[i];
		}
		return unsortedInt[lo];
	}
	
	private static void exchange(int[] toExchange, int alpha, int beta ){
		int swap = toExchange[alpha];
		toExchange[alpha]=toExchange[beta];
		toExchange[beta]=swap;
	}
	
	
	
	private static boolean less(Integer Integer, Integer Integer2) {

		return (Integer.compareTo(Integer2)<0);
	}



	public int[] getInt() {
		// TODO Auto-generated method stub
		return toSort;
	}
}
