package algorithms;

public class InsertionSort implements SortInterface{
	public static int[] toSort;
	
	
	public void sort(int[] unsortedInt){
		int n =unsortedInt.length;
		for(int i = 0;i<n;i++){
			for(int j=i;j>0;j--)
				if(less(unsortedInt[j],unsortedInt[j-1]))
					exchange(unsortedInt,j,j-1);
				else break;	
		}
		for(int k=0;k<unsortedInt.length;k++)toSort[k]=unsortedInt[k];
	}
	private static void exchange(int[] toExchange, int alpha, int beta ){
		int swap = toExchange[alpha];
		toExchange[alpha]=toExchange[beta];
		toExchange[beta]=swap;
	}
	
	private static boolean less(Integer Integer, Integer Integer2) {

		return (Integer.compareTo(Integer2)<0);
	}
	public void setSort(int[] unsortedInt) {
		// TODO Auto-generated method stub
		int n =unsortedInt.length;
		toSort = new int[n];
		for(int i = 0;i<n;i++)toSort[i]=unsortedInt[i];
	}
	public int[] getInt() {
		// TODO Auto-generated method stub
		return toSort;
	}

	
	
}
