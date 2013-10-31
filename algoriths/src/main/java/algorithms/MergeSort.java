package algorithms;

public class MergeSort implements SortInterface{
	public static int[] toSort;
	
	public void setSort(int[] unsortedInt) {
		// TODO Auto-generated method stub
		int n =unsortedInt.length;
		toSort = new int[n];
		for(int i = 0;i<n;i++)toSort[i]=unsortedInt[i];
	}
	


	private static void merge(int[] unsortedInt, int[] aux, int lo, int mid, int hi) {
		// TODO Auto-generated method stub
		for(int k=lo;k<=hi;k++)
			aux[k]=unsortedInt[k];
		int i= lo, j=mid+1;
		for (int k=lo;k<=hi;k++)
		{
			if      (i>mid)               unsortedInt[k] = aux[j++];
			else if (j>hi)                unsortedInt[k] = aux[i++];
			else if (less(aux[j],aux[i])) unsortedInt[k] = aux[j++];
			else                          unsortedInt[k] = aux[i++];
		}
		for(int m=0;m<unsortedInt.length;m++)toSort[m]=unsortedInt[m];
		
	}
	private static void sort(int[] unsortedInt, int[] aux,int lo, int hi){
		if (hi<=lo)return;
		int mid = lo+(hi-lo)/2;
		sort(unsortedInt,aux,lo,mid);
		sort(unsortedInt,aux,mid+1,hi);
		merge(unsortedInt,aux,lo,mid, hi);
		
	}
	public void sort(int[] unsortedInt){
		int[] aux=new int[unsortedInt.length];
		sort(unsortedInt, aux, 0,unsortedInt.length-1);
		
	}
	private static boolean less(Integer Integer, Integer Integer2) {

		return (Integer.compareTo(Integer2)<0);
	}



	public int[] getInt() {
		// TODO Auto-generated method stub
		return toSort;
	}


	
	

}
